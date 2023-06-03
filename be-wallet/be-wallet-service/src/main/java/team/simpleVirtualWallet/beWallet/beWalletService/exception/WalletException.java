package team.simpleVirtualWallet.beWallet.beWalletService.exception;

import lombok.Data;
import lombok.Getter;

@Getter
public class WalletException extends Exception {

    public enum WalletExceptionType {
        None,
        Unknown,
        NoSuchWallet,
        WrongCurrencyFromWallet
    }

    private WalletExceptionType type;
    public WalletException(WalletExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
