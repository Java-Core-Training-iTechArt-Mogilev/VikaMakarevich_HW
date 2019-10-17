package com.best.qa.bank;

import com.best.qa.bank.Balance.Balance;

import java.util.List;

public class Account {
    private String login;
    private String password;
    private List<Balance> balances;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public Account setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public Account setBalances(List<Balance> balances) {
        this.balances = balances;
        return this;
    }
}
