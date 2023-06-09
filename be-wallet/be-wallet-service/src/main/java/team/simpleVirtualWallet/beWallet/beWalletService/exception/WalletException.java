package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
public class WalletException extends RuntimeException {

    public enum WalletExceptionType {
        None,
        Unknown,
        NoSuchUser,
        NoSuchWallet,
        WrongCurrencyFromWallet
    }

    private WalletExceptionType type;

    @Setter
    private String domain = "";

    private Timestamp timestamp;
    public WalletException(WalletExceptionType type, String message) {
        super(message);
        this.type = type;
        timestamp = new Timestamp(System.currentTimeMillis());
    }
}
