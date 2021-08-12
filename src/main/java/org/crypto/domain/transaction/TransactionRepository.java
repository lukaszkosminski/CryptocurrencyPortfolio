package org.crypto.domain.transaction;

import org.crypto.domain.coin.Coin;
import org.crypto.domain.coin.CoinName;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public Transaction createNewTransaction(TransactionType transactionType, Coin coin, int priceUSD, int amount, LocalDateTime localDateTime){
        Random random = new Random();
        Transaction newTransaction = new Transaction(random.nextInt(), transactionType, coin,priceUSD, amount,localDateTime);
        transactions.add(newTransaction);
        return newTransaction;
    }
}
