package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import team.simpleVirtualWallet.beWallet.beWalletService.model.Wallet;

import java.util.List;

@Data
@AllArgsConstructor
public class GetWalletsResponseDto {

    private List<Wallet> wallets;
}
