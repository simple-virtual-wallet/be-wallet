package team.simpleVirtualWallet.beWallet.beWalletService.service.grpc;

import com.google.protobuf.Any;
import com.google.rpc.Code;
import com.google.rpc.ErrorInfo;
import com.google.rpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import team.simpleVirtualWallet.beWallet.beWalletService.exception.TransactionException;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;
import team.simpleVirtualWallet.beWallet.beWalletService.service.TransactionService;
import team.simpleVirtualWallet.beWallet.beWalletService.service.WalletService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//https://yidongnan.github.io/grpc-spring-boot-starter/zh-CN/server/getting-started.html
@GrpcService
@Slf4j
public class WalletServiceGrpcImpl extends WalletServiceGrpc.WalletServiceImplBase {

    @Autowired
    private WalletService walletService;

    @Autowired
    private TransactionService transactionService;

    public void createWallet(WalletGrpc.CreateWalletReq req,
                             StreamObserver<WalletGrpc.CreateWalletRes> responseObserver) {
        log.info("createWallet: {}", req);

        var id = walletService.addWallet(Wallet
                .builder()
                .userId((int) req.getUserID())
                .currency(req.getCurrency())
                .amount(new BigDecimal("0"))
                .build());

        WalletGrpc.CreateWalletRes res = WalletGrpc.CreateWalletRes.newBuilder().setWalletID(id).build();

        log.info("createWallet: return {}", res);

        // 调用onNext()方法来通知gRPC框架把reply 从server端 发送回 client端
        responseObserver.onNext(res);

        // 表示完成调用
        responseObserver.onCompleted();
    }

    /**
     */
    public void getWallets(WalletGrpc.GetWalletsReq req,
                           StreamObserver<WalletGrpc.GetWalletsRes> responseObserver) {
        log.info("getWallets: {}", req);

        List<WalletGrpc.Wallet> result = new ArrayList<>();
        if(req.hasUserID()) {
            if(req.hasCurrency()) {
                var wallet = walletService.getWallet((int) req.getUserID(), req.getCurrency());
                if(wallet.isPresent()) {
                    result.add(
                            WalletGrpc.Wallet
                                    .newBuilder()
                                    .setId(wallet.get().getId())
                                    .setUserID(wallet.get().getUserId())
                                    .setAmount(wallet.get().getAmount().toString())
                                    .setCurrency(wallet.get().getCurrency())
                                    .setCreatedAt(wallet.get().getCreatedAt().getTime() / 1000L)
                                    .setUpdatedAt(wallet.get().getUpdatedAt().getTime() / 1000L)
                                    .build()
                    );
                }
            } else {
                var wallets = walletService.getWallets((int) req.getUserID());
                result.addAll(
                        wallets.stream().map(w -> {
                            return WalletGrpc.Wallet
                                    .newBuilder()
                                    .setId(w.getId())
                                    .setUserID(w.getUserId())
                                    .setAmount(w.getAmount().toString())
                                    .setCurrency(w.getCurrency())
                                    .setCreatedAt(w.getCreatedAt().getTime() / 1000L)
                                    .setUpdatedAt(w.getUpdatedAt().getTime() / 1000L)
                                    .build();
                        }).toList());
            }
        } else {
            var wallet = walletService.getWallet((int) req.getId());
            if(wallet.isPresent()) {
                result.add(WalletGrpc.Wallet
                        .newBuilder()
                        .setId(wallet.get().getId())
                        .setUserID(wallet.get().getUserId())
                        .setAmount(wallet.get().getAmount().toString())
                        .setCurrency(wallet.get().getCurrency())
                        .setCreatedAt(wallet.get().getCreatedAt().getTime() / 1000L)
                        .setUpdatedAt(wallet.get().getUpdatedAt().getTime() / 1000L)
                        .build());
            }
        }

        WalletGrpc.GetWalletsRes res = WalletGrpc.GetWalletsRes.newBuilder().addAllWallets(result).build();

        log.info("getWallets: return {}", res);

        // 调用onNext()方法来通知gRPC框架把reply 从server端 发送回 client端
        responseObserver.onNext(res);

        // 表示完成调用
        responseObserver.onCompleted();
    }

    /**
     */
    public void transaction(WalletGrpc.TransactionReq req,
                            StreamObserver<WalletGrpc.TransactionRes> responseObserver) {
        log.info("transaction: {}", req);

        var record = transactionService.processTransaction(
                (int) req.getWalletID(),
                req.getActionValue(),
                new BigDecimal(req.getAmount()),
                req.getCurrency(),
                (int) req.getCommitterID(),
                req.getRemark()
        );

        if(!record.isPresent()) {
            throw new TransactionException(
                    TransactionException.TransactionExceptionType.Unknown,
                    "transaction: no record returned");
        }

        WalletGrpc.TransactionRes res = WalletGrpc.TransactionRes.newBuilder()
                .setId(record.get().getId())
                .setBeforeAmount(record.get().getBeforeAmount().toString())
                .setAfterAmount(record.get().getAfterAmount().toString())
                .setCurrency(record.get().getCurrency())
                .setCreatedAt(record.get().getCreatedAt().getTime() / 1000L)
                .setUpdatedAt(record.get().getUpdatedAt().getTime() / 1000L)
                .build();

        log.info("transaction: return {}", res);

        // 调用onNext()方法来通知gRPC框架把reply 从server端 发送回 client端
        responseObserver.onNext(res);

        // 表示完成调用
        responseObserver.onCompleted();
    }

    /**
     */
    public void getTransactionRecords(WalletGrpc.GetTransactionRecordsReq req,
                                      StreamObserver<WalletGrpc.GetTransactionRecordsRes> responseObserver) {

        log.info("getTransactionRecords: {}", req);

        if(!req.hasUserID() || req.getCurrencyCount() != 1) {
            throw new TransactionException(TransactionException.TransactionExceptionType.Unimplemented, "only implemented get with userId and 1 currency");
        }

        var records = transactionService.getTransactionRecords(
                (int) req.getUserID(),
                req.getCurrency(0)
        );

        List<WalletGrpc.TransactionRecord> results = new ArrayList<>();

        for(var r : records) {
            var builder = WalletGrpc.TransactionRecord.newBuilder()
                            .setId(r.getId())
                            .setUserID(r.getUserId())
                            .setWalletID(r.getWalletId())
                            .setAction(WalletGrpc.Action.valueOf(r.getAction().getValue()))
                            .setAmount(r.getAmount().toString())
                            .setBeforeAmount(r.getBeforeAmount().toString())
                            .setAfterAmount(r.getAfterAmount().toString())
                            .setCurrency(r.getCurrency())
                            .setCommitterID(r.getCommitterId())
                            .setStatus(WalletGrpc.Status.valueOf(r.getStatus().getValue()))
                            .setRemark(r.getRemark())
                            .setCreatedAt(r.getCreatedAt().getTime() / 1000L)
                            .setUpdatedAt(r.getUpdatedAt().getTime() / 1000L);
            if(r.getRemark() != null) {
                builder = builder.setRemark(r.getRemark());
            }
            if(r.getRollbackBeforeAmount() != null) {
                builder = builder.setRollbackBeforeAmount(r.getRollbackBeforeAmount().toString());
            }
            if(r.getRollbackAfterAmount() != null) {
                builder = builder.setRollbackAfterAmount(r.getRollbackAfterAmount().toString());
            }
            if(r.getRollbackerId() != null) {
                builder = builder.setRollbackerID(r.getRollbackerId());
            }
            results.add(builder.build());
        }

        WalletGrpc.GetTransactionRecordsRes res = WalletGrpc.GetTransactionRecordsRes.newBuilder()
                .addAllRecords(results)
                .setPaginationInfo(WalletGrpc.PaginationInfo.newBuilder()
                        .setCurrentPage(0)
                        .setTotalRows(records.size())
                        .setPageSize(9999)
                        .build())
                .build();

        log.info("transaction: return {}", res);

        // 调用onNext()方法来通知gRPC框架把reply 从server端 发送回 client端
        responseObserver.onNext(res);

        // 表示完成调用
        responseObserver.onCompleted();

    }
}



