package team.simpleVirtualWallet.beWallet.beWalletService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.simpleVirtualWallet.beWallet.beWalletService.dto.*;
import team.simpleVirtualWallet.beWallet.beWalletService.exception.WalletException;
import team.simpleVirtualWallet.beWallet.beWalletService.service.TransactionService;

import javax.validation.Valid;

@RestController
@Slf4j
public class TransactionController {


    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transaction")
    public ResponseEntity<AddTransactionResponseDto> addTransaction(@Valid @RequestBody AddTransactionRequestDto req) throws WalletException {

        var record = transactionService.processTransaction(
                req.getWalletId(),
                req.getAction(),
                req.getAmount(),
                req.getCurrency(),
                req.getCommitterId(),
                req.getRemark()
        );

        if(record.isEmpty()) {
            log.error("addTransaction: no transaction record return");
            throw new WalletException(WalletException.WalletExceptionType.Unknown, "no transaction record return");
        }

        return new ResponseEntity<AddTransactionResponseDto>(new AddTransactionResponseDto(record.get()), HttpStatus.CREATED);
    }

    @GetMapping("/transactions")
    public ResponseEntity<GetTransactionsResponseDto> GetTransactions(@Valid @RequestBody GetTransactionsRequestDto req) throws WalletException {

        var records = transactionService.getTransactionRecords(
                req.getUserId(),
                req.getCurrency()
        );

        return new ResponseEntity<GetTransactionsResponseDto>(new GetTransactionsResponseDto(records), HttpStatus.OK);
    }

}
