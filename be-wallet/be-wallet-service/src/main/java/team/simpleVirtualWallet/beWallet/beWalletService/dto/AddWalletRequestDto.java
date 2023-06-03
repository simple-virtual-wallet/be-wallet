package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;

import javax.validation.Valid;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddWalletRequestDto {
    @Valid
    private Wallet wallet;

}
