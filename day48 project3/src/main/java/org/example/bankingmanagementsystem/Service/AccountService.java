package org.example.bankingmanagementsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.bankingmanagementsystem.Api.ApiException;
import org.example.bankingmanagementsystem.Model.Account;
import org.example.bankingmanagementsystem.Model.User;
import org.example.bankingmanagementsystem.Repository.AccountRepository;
import org.example.bankingmanagementsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    // employee – get all accounts
    public List<Account> getAllAccounts() {
        if (accountRepository.findAll().isEmpty()) {
            throw new ApiException("No accounts found");
        }
        return accountRepository.findAll();
    }

    // customer – get my accounts
    public Set<Account> getMyAccounts(Integer userId) {

        User user = userRepository.findUserById(userId);
        if (user == null || user.getCustomer() == null) {
            throw new ApiException("Customer not found");
        }

        return user.getCustomer().getAccounts();
    }

    //  create account
    public void addAccount(Account account) {
        accountRepository.save(account);
    }

    // activate account
    public void activateAccount(Integer accountId) {

        Account account = accountRepository.findAccountById(accountId);
        if (account == null) {
            throw new ApiException("Account not found");
        }

        account.setIsActive("true");
        accountRepository.save(account);
    }

    // block account
    public void blockAccount(Integer accountId) {

        Account account = accountRepository.findAccountById(accountId);
        if (account == null) {
            throw new ApiException("Account not found");
        }

        account.setIsActive("false");
        accountRepository.save(account);
    }

    // deposit
    public void deposit(Integer accountId, Integer userId, Double amount) {

        if (amount <= 0) {
            throw new ApiException("Amount must be greater than zero");
        }

        Account account = checkAccounct(accountId, userId);

        if (account == null) {
            throw new ApiException("Account not found");
        }

        if (!account.getIsActive().equals("true")) {
            throw new ApiException("Account is not active");
        }

        account.setBalance(account.getBalance() + amount);
        accountRepository.save(account);
    }

    // withdraw
    public void withdraw(Integer accountId, Integer userId, Double amount) {

        if (amount <= 0) {
            throw new ApiException("Amount must be greater than zero");
        }

        Account account = checkAccounct(accountId, userId);
        if (account == null) {
            throw new ApiException("Account not found");
        }

        if (!account.getIsActive().equals("true")) {
            throw new ApiException("Account is not active");
        }

        if (account.getBalance() < amount) {
            throw new ApiException("Insufficient balance");
        }

        account.setBalance(account.getBalance() - amount);
        accountRepository.save(account);
    }

    // transfer
    @Transactional
    public void transfer(Integer fromId, Integer toId,  Integer userId, Double amount) {

        if (amount <= 0) {
            throw new ApiException("Amount must be greater than zero");
        }

        Account from = checkAccounct(fromId, userId);
        Account to = accountRepository.findAccountById(toId);

        if (from == null || to == null) {
            throw new ApiException("Account not found");
        }

        if (!from.getIsActive().equals("true") || !to.getIsActive().equals("true")) {
            throw new ApiException("Account not active");
        }

        if (from.getBalance() < amount) {
            throw new ApiException("Insufficient balance");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountRepository.save(from);
        accountRepository.save(to);
    }


    private Account checkAccounct (Integer accountId, Integer userId) {

        Account account = accountRepository.findAccountById(accountId);
        if (account == null) {
            throw new ApiException("Account not found");
        }

        User user = userRepository.findUserById(userId);
        if (user == null) {
            throw new ApiException("User not found");
        }


        if (user.getRole().equals("CUSTOMER")) {

            if (account.getCustomer() == null || !account.getCustomer().getId().equals(userId)) {
                throw new ApiException("You are not authorized to access this account");
            }
        }

        return account;
    }

}
