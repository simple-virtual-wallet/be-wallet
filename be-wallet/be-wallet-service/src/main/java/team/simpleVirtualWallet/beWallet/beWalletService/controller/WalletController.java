package team.simpleVirtualWallet.beWallet.beWalletService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.simpleVirtualWallet.beWallet.beWalletService.dto.*;
import team.simpleVirtualWallet.beWallet.beWalletService.service.WalletService;

import javax.validation.*;

@RestController
public class WalletController {

    @Autowired
    WalletService walletService;

    @PostMapping("/wallet")
    public ResponseEntity<AddWalletResponseDto> addWallet(@Valid @RequestBody AddWalletRequestDto req) {

        var id = walletService.addWallet(req.getWallet());
        return new ResponseEntity<AddWalletResponseDto>(new AddWalletResponseDto(id), HttpStatus.CREATED);
    }

    @GetMapping("/wallet")
    public ResponseEntity<GetWalletResponseDto> getWallet(@Valid @RequestBody GetWalletRequestDto req) {

        if(req.getId() != null) {
            var wallet = walletService.getWallet(req.getId());
            if(wallet.isPresent()) {
                return new ResponseEntity<>(new GetWalletResponseDto(wallet.get()), HttpStatus.OK);
            }
        }

        if(req.getUserId() != null && req.getCurrency() != null) {
            var wallet = walletService.getWallet(req.getUserId(), req.getCurrency());
            if(wallet.isPresent()) {
                return new ResponseEntity<>(new GetWalletResponseDto(wallet.get()), HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(new GetWalletResponseDto(null), HttpStatus.OK);
    }

    @GetMapping("/wallets")
    public ResponseEntity<GetWalletsResponseDto> getWallets(@Valid @RequestBody GetWalletsRequestDto req) {
        var wallets = walletService.getWallets(req.getUserId());
        return new ResponseEntity<>(new GetWalletsResponseDto(wallets), HttpStatus.OK);
    }
}
