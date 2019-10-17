package com.best.qa.bank;

import com.best.qa.bank.Balance.Balance;

public class Card {
    private User user;
    private Balance balance;

    public Card(User user, Balance balance) {
        this.user = user;
        this.balance = balance;
    }

    private Card setUser(User user) {
        this.user = user;
        return this;
    }

    public Balance getBalance() {
        return balance;
    }

    private Card setBalance(Balance balance) {
        this.balance = balance;
        return this;
    }
}
