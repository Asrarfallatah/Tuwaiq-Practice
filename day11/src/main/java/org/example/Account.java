package org.example;

public class Account {
    private String accountID ;
    private String accountName ;
    private int accountBalance ;

    // constructor
    public  Account(String accountID , String accountName){
        this.accountID = accountID;
        this.accountName = accountName;
    }
    public Account(String accountID, String accountName, int accountBalance){
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // setter
    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

   // getter
    public String getAccountID() {
        return accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    // methods :

    public int accountCredit (int accountAmount){
        if (accountAmount > 0) {
            this.accountBalance += accountAmount;
            System.out.println(accountName + " credited: " + accountAmount);
        } else {
            System.out.println("invalid credit amount.");
        }
        return this.accountBalance;
    }

    public int accountDebit(int accountAmount){
        if ((accountAmount > 0 )&& (accountAmount <= accountAmount )) {
            accountBalance -= accountAmount;
            System.out.println(accountName + " debited: " + accountAmount);
        }else if (accountAmount > accountBalance) {
            System.out.println("debit error: you dont have enough balance.");
        } else {
            System.out.println("debit error: balance must be greater than 0.");
        }
        return accountBalance;
    }

    public int transferTo(Account another, int accountAmount){
        if (this.accountDebit(accountAmount) != this.accountBalance) {
            return this.accountBalance;
        }
        another.accountCredit(accountAmount);
        System.out.println(this.accountName  + " transferred " + accountAmount + " to " + another.accountName);
        return this.accountBalance;
    }

    public String toString(){
        return  "\naccount id = " + accountID +
                "\naccount name = " + accountName +
                "\naccount balance = " + accountBalance;
    }


}
