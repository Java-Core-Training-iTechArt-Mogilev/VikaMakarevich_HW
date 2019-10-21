package com.best.qa.bank.Balance;

import com.best.qa.bank.CurrencyType;

public class BalanceUsd extends Balance {

    public BalanceUsd() {
        super(CurrencyType.USD);
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance in USD: " + getBalanceSum() + " USD");
    }
}
