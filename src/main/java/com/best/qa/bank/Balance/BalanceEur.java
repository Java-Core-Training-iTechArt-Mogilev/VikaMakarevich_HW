package com.best.qa.bank.Balance;

import com.best.qa.bank.CurrencyType;

public class BalanceEur extends Balance {

    public BalanceEur() {
        super(CurrencyType.EUR);
    }

    @Override
    public void displayBalance() {
        System.out.println("Balance in EUR: " + getBalanceSum() + " EUR");
    }
}
