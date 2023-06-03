package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.AssertTrue;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetWalletRequestDto {
    @Nullable
    private Integer id;

    @Nullable
    private Integer userId;

    @Nullable
    private String currency;

    @AssertTrue(message = "at least 1 param is required")
    private boolean hasParam() {
        return id != null || (userId != null && currency != null);
    }
}