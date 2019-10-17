package com.best.qa;

import com.best.qa.bank.Account;
import com.best.qa.bank.Atm;
import com.best.qa.bank.Balance.Balance;
import com.best.qa.bank.Balance.BalanceByn;
import com.best.qa.bank.Balance.BalanceEur;
import com.best.qa.bank.Balance.BalanceUsd;
import com.best.qa.bank.Card;
import com.best.qa.bank.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class World {

    public static void main(String[] args) {
        BigDecimal sumOfMoney = new BigDecimal(20);
        Balance balanceByn = new BalanceByn();
        Balance balanceUsd = new BalanceUsd();
        Balance balanceEur = new BalanceEur();

        Account account = new Account("vika_mak", "123");
        List<Balance> balances = Arrays.asList(balanceByn, balanceUsd, balanceEur);
        User userVika = createUser("Vika", "Makarevich", account, balances);

        List<Card> cards = Arrays.asList(new Card(userVika, balanceByn), new Card(userVika, balanceUsd), new Card(userVika, balanceEur));

        Atm atm = new Atm();

        for (Card card : cards) {
            atm.putMoney(card, sumOfMoney);
            atm.displayBalance(card);
        }

        for (Card card : cards) {
            atm.withdrawMoney(card, sumOfMoney);
            atm.displayBalance(card);
        }

        System.out.println("Hello World");
    }

    private static User createUser(String firstName, String lastName, Account account, List<Balance> balances) {
        account.setBalances(balances);
        User user = new User(firstName, lastName)
                .setAccount(account);
        return user;
    }
}
