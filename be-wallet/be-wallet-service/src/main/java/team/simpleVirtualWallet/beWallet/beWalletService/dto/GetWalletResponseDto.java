package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;


@Data
@AllArgsConstructor
public class GetWalletResponseDto {

    private Wallet wallet;
}
