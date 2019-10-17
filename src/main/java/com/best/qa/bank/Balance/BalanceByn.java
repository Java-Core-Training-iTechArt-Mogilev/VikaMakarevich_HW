package com.best.qa.bank.Balance;

import com.best.qa.bank.CurrencyType;

public class BalanceByn extends Balance {

    public BalanceByn() {
        super(CurrencyType.BYN);
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance in BYN: " + getBalanceSum() + " BYN");
    }
}
