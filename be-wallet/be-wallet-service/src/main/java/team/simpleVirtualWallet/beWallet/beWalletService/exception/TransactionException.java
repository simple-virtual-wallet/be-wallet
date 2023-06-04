package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
public class TransactionException extends RuntimeException {

    public enum TransactionExceptionType {
        None,
        Unknown,
        TransactionFailed,
        Unimplemented
    }

    private TransactionExceptionType type;

    @Setter
    private String domain;

    private Timestamp timestamp;
    public TransactionException(TransactionExceptionType type, String message) {
        super(message);
        this.type = type;
        timestamp = new Timestamp(System.currentTimeMillis());
    }
}