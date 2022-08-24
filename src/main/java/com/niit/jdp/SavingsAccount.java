/*
 * Author Name: Mridul
 * Date: 24-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String status;

    public SavingsAccount() {
    }

    public SavingsAccount(long accountNumber, String accountHolderName, double accountBalance, String status) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.status = status;
    }
}
