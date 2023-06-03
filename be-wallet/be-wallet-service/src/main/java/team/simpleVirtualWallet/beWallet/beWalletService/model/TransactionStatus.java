package team.simpleVirtualWallet.beWallet.beWalletService.model;

import lombok.Getter;
import team.simpleVirtualWallet.beWallet.beWalletService.utility.enumUtility.ConverterBase;
import team.simpleVirtualWallet.beWallet.beWalletService.utility.enumUtility.EnumBase;

@Getter
public enum TransactionStatus implements EnumBase<Integer> {
    None(0),
    Pending(1),                    // 待辦
    Success(2),                    // 成功
    Failed(3),                     // 失敗
    Rollback(4);                   // 回滾

    private final int value;
    private TransactionStatus(int i) {
        value = i;
    }

    private final static TransactionStatus[] enumValues = TransactionStatus.values();

    public static TransactionStatus fromInteger(int i) {
        return enumValues[i];
    }

    public static class Converter extends ConverterBase<TransactionStatus, Integer> {
        public Converter() {
            super(TransactionStatus.class);
        }
    }

}
