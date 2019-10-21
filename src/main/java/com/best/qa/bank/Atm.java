package com.best.qa.bank;

import java.math.BigDecimal;

public class Atm {

    public BigDecimal withdrawMoney(Card card, BigDecimal someMoney) {
        return card.getBalance().decreaseBalance(someMoney);
    }

    public BigDecimal putMoney(Card card, BigDecimal someMoney) {
        return card.getBalance().increaseBalance(someMoney);
    }

    public void displayBalance(Card card) {
        card.getBalance().displayBalance();
    }
}
