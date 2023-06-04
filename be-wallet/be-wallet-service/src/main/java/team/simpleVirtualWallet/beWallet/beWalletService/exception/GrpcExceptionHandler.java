package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import com.google.protobuf.Any;
import com.google.rpc.Code;
import com.google.rpc.ErrorInfo;
import io.grpc.Status;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import team.simpleVirtualWallet.beWallet.beWalletService.service.grpc.WalletGrpc;

import java.sql.Timestamp;

@GrpcAdvice
public class GrpcExceptionHandler {

    @net.devh.boot.grpc.server.advice.GrpcExceptionHandler
    public Status handleInvalidArgument(IllegalArgumentException e) {
        return Status.INVALID_ARGUMENT.withDescription("invalid argument").withCause(e);
    }

    @net.devh.boot.grpc.server.advice.GrpcExceptionHandler
    public Status handleDataIntegrityViolationException(DataIntegrityViolationException e) {

        return Status.INVALID_ARGUMENT.withDescription(
                ErrorInfo.newBuilder()
                        .setReason(e.getMessage())
                        .setDomain("sql")
                        .putMetadata("errorCode", "ERR001")
                        .putMetadata("timestamp", new Timestamp(System.currentTimeMillis()).toString())
                        .build().toString()
        ).withCause(e);
    }

    @net.devh.boot.grpc.server.advice.GrpcExceptionHandler
    public Status handleWalletException(WalletException e) {
        var statusBuilder = com.google.rpc.Status.newBuilder();

        switch(e.getType()) {
            case NoSuchUser:
                return Status.NOT_FOUND.withDescription(
                        ErrorInfo.newBuilder()
                                .setReason(e.getMessage())
                                .setDomain(e.getDomain())
                                .putMetadata("errorCode", "ERR005")
                                .putMetadata("timestamp", e.getTimestamp().toString())
                                .build().toString()
                ).withCause(e);
            case NoSuchWallet:
                return Status.NOT_FOUND.withDescription(
                        ErrorInfo.newBuilder()
                                .setReason(e.getMessage())
                                .setDomain(e.getDomain())
                                .putMetadata("errorCode", "ERR003")
                                .putMetadata("timestamp", e.getTimestamp().toString())
                                .build().toString()
                ).withCause(e);
//                statusBuilder = statusBuilder.setCode(Code.NOT_FOUND.getNumber())
//                        .setMessage(e.getMessage())
//                        .addDetails(Any.pack(ErrorInfo.newBuilder()
//                                .setReason(e.getMessage())
//                                .setDomain(e.getDomain())
//                                .putMetadata("errorCode", "ERR003")
//                                .putMetadata("timestamp", e.getTimestamp().toString())
//                                .build()));
            case WrongCurrencyFromWallet:
                return Status.UNAVAILABLE.withDescription(
                        ErrorInfo.newBuilder()
                                .setReason(e.getMessage())
                                .setDomain(e.getDomain())
                                .putMetadata("errorCode", "ERR004")
                                .putMetadata("timestamp", e.getTimestamp().toString())
                                .build().toString()
                ).withCause(e);
//                statusBuilder = statusBuilder.setCode(Code.UNAVAILABLE.getNumber())
//                        .setMessage(e.getMessage())
//                        .addDetails(Any.pack(ErrorInfo.newBuilder()
//                                .setReason(e.getMessage())
//                                .setDomain(e.getDomain())
//                                .putMetadata("errorCode", "ERR004")
//                                .putMetadata("timestamp", e.getTimestamp().toString())
//                                .build()));
        }
        return Status.UNKNOWN.withCause(e);
    }
}
