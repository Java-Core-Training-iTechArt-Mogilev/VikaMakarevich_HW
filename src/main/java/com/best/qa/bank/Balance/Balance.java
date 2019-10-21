package com.best.qa.bank.Balance;

import com.best.qa.bank.CurrencyType;

import java.math.BigDecimal;

public abstract class Balance {
    private BigDecimal balanceSum;
    private CurrencyType currencyType;

    public Balance(CurrencyType currencyType) {
        setBalanceSum(new BigDecimal(0));
        this.currencyType = currencyType;
    }

    public BigDecimal getBalanceSum() {
        return balanceSum;
    }

    public void setBalanceSum(BigDecimal balanceSumByn) {
        this.balanceSum = balanceSumByn;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public BigDecimal decreaseBalance(BigDecimal sumMinus) {
        BigDecimal result;

        if (balanceSum.compareTo(sumMinus) == -1) {
            System.out.println("It is possible to withdraw only " + balanceSum);
            return balanceSum;
        }

        return balanceSum = balanceSum.subtract(sumMinus);
    }

    public BigDecimal increaseBalance(BigDecimal sumPlus) {
        return balanceSum = balanceSum.add(sumPlus);
    }

    public abstract void displayBalance();
}
