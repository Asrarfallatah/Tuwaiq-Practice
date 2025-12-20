package org.example.bankingmanagementsystem.Controller;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiResponse;
import org.example.bankingmanagementsystem.Model.Account;
import org.example.bankingmanagementsystem.Model.User;
import org.example.bankingmanagementsystem.Service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    // get all account
    @GetMapping("/get")
    public ResponseEntity<?> getAllAccounts() {
        return ResponseEntity.status(200).body(accountService.getAllAccounts());
    }

    //get my accounts
    @GetMapping("/get-my-accounts")
    public ResponseEntity<?> getMyAccounts(@AuthenticationPrincipal User user) {

        return ResponseEntity.status(200).body(accountService.getMyAccounts(user.getId()));
    }

    @PostMapping("/add")
    public ResponseEntity<?> addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
        return ResponseEntity.status(200).body(new ApiResponse("Account added successfully"));
    }

    @PutMapping("/activate/{accountId}")
    public ResponseEntity<?> activateAccount(@PathVariable Integer accountId) {

        accountService.activateAccount(accountId);
        return ResponseEntity.status(200).body(new ApiResponse("Account activated successfully"));
    }

    @PutMapping("/block/{accountId}")
    public ResponseEntity<?> blockAccount(@PathVariable Integer accountId) {

        accountService.blockAccount(accountId);
        return ResponseEntity.status(200).body(new ApiResponse("Account blocked successfully"));
    }

    @PutMapping("/deposit/{accountId}/{amount}")
    public ResponseEntity<?> deposit( @AuthenticationPrincipal User user, @PathVariable Integer accountId, @PathVariable Double amount) {

        accountService.deposit(accountId, user.getId(), amount);
        return ResponseEntity.status(200).body(new ApiResponse("Deposit successful"));
    }

    @PutMapping("/withdraw/{accountId}/{amount}")
    public ResponseEntity<?> withdraw( @AuthenticationPrincipal User user, @PathVariable Integer accountId, @PathVariable Double amount) {

        accountService.deposit(accountId, user.getId(), amount);
        return ResponseEntity.status(200).body(new ApiResponse("Withdraw successful"));
    }

    @PutMapping("/transfer/{fromId}/{toId}/{amount}")
    public ResponseEntity<?> transfer(@AuthenticationPrincipal User user, @PathVariable Integer fromId, @PathVariable Integer toId, @PathVariable Double amount) {

        accountService.transfer(fromId, toId, user.getId(), amount);
        return ResponseEntity.status(200).body(new ApiResponse("Transfer successful"));
    }

}

