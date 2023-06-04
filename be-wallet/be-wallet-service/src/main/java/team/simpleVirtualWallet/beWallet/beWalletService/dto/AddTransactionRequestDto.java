package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTransactionRequestDto {

    @NotNull(message = "userId is null.")
    @Min(value = 1, message = "userId cannot lower than 1")
    Integer userId;

    @NotNull(message = "walletId is null.")
    @Min(value = 1, message = "walletId cannot lower than 1")
    Integer walletId;

    @NotNull(message = "action is null.")
    @Min(value = 1, message = "action cannot lower than 1")
    Integer action;

    @NotNull(message = "amount is null.")
    @Digits(integer=19, fraction=4)
    BigDecimal amount;

    @NotNull(message = "currency is null.")
    @NotBlank(message = "currency is blank.")
    @NotEmpty(message = "currency is empty.")
    String currency;

    @NotNull(message = "committerId is null.")
    @Min(value = 1, message = "committerId cannot lower than 1")
    Integer committerId;

    @NotNull(message = "remark is null.")
    String remark;
}