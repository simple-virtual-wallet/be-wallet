package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTransactionsRequestDto {

    @NotNull(message = "userId is null.")
    @Min(value = 1, message = "userId cannot lower than 1")
    private Integer userId;

    @NotNull(message = "currency is null.")
    @NotBlank(message = "currency is blank.")
    @NotEmpty(message = "currency is empty.")
    private String currency;

}
