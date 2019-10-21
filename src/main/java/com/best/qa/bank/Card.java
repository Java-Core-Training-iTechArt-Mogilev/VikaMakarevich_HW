package com.best.qa.bank;

import com.best.qa.bank.Balance.Balance;

public class Card {
    private User user;
    private Balance balance;

    public Card(User user, Balance balance) {
        this.user = user;
        this.balance = balance;
    }

    private void setUser(User user) {
        this.user = user;
    }

    public Balance getBalance() {
        return balance;
    }

    private void setBalance(Balance balance) {
        this.balance = balance;
    }
}
