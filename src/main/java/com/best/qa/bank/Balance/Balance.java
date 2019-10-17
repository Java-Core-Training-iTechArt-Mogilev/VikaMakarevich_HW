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

    public Balance setBalanceSum(BigDecimal balanceSumByn) {
        this.balanceSum = balanceSumByn;
        return this;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public Balance setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
        return this;
    }

    public BigDecimal decreaseBalance(BigDecimal sumMinus) {
        BigDecimal result;

        if (balanceSum.compareTo(sumMinus) == -1) {
            System.out.println("It is possible to withdraw only " + balanceSum);
            return balanceSum;
        }

        result = balanceSum.subtract(sumMinus);
        setBalanceSum(result);
        return balanceSum;
    }

    public BigDecimal increaseBalance(BigDecimal sumPlus) {
        BigDecimal result = balanceSum.add(sumPlus);
        setBalanceSum(result);
        return result;
    }

    public abstract void displayBalance();
}
