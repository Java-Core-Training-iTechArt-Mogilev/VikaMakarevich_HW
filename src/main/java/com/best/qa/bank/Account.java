package com.best.qa.bank;

import com.best.qa.bank.Balance.Balance;

import java.util.List;

public class Account {
    private String login;
    private String password;
    private List<Balance> balances;

    public Account(String login, String password, List<Balance> balances) {
        this.login = login;
        this.password = password;
        this.balances = balances;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }
}
