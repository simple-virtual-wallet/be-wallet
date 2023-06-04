package team.simpleVirtualWallet.beWallet.beWalletService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import team.simpleVirtualWallet.beWallet.beWalletService.model.TransactionRecord;

import java.util.List;

@Data
@AllArgsConstructor
public class GetTransactionsResponseDto {
    private List<TransactionRecord> transactionRecords;
}