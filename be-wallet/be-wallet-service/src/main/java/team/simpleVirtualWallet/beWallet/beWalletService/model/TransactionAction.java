package team.simpleVirtualWallet.beWallet.beWalletService.model;

import lombok.Getter;
import team.simpleVirtualWallet.beWallet.beWalletService.utility.enumUtility.ConverterBase;
import team.simpleVirtualWallet.beWallet.beWalletService.utility.enumUtility.EnumBase;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Getter
public enum TransactionAction implements EnumBase<Integer> {
    None(0),
    Deposit(1),                     // 入金
    Withdraw(2),                    // 出金
    Bonus(3),                       // 贈送
    Interest(4),                    // 利息
    Open(5),                        // 開倉
    Close(6),                       // 平倉
    Manually(7);                    // 人工更改

    private final Integer value;

    private TransactionAction(int i) {
        value = i;
    }

    private final static TransactionAction[] enumValues = TransactionAction.values();

    public static TransactionAction fromInteger(int i) {
        return enumValues[i];
    }

    public static class Converter extends ConverterBase<TransactionAction, Integer> {
        public Converter() {
            super(TransactionAction.class);
        }
    }

}
