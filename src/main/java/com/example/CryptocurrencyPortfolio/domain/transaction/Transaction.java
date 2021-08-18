package com.example.CryptocurrencyPortfolio.domain.transaction;

import java.time.LocalDateTime;

public class Transaction {
    private final long id;
    private final String transactionType;
    private final String coin;
    private final int priceUSD;
    private final int amount;
    LocalDateTime localDateTime;

    public Transaction(long id, String transactionType, String coin, int priceUSD, int amount, LocalDateTime localDateTime) {
        this.id = id;
        this.transactionType = transactionType;
        this.coin = coin;
        this.priceUSD = priceUSD;
        this.amount = amount;
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", transactionType='" + transactionType + '\'' +
                ", coin='" + coin + '\'' +
                ", priceUSD=" + priceUSD +
                ", amount=" + amount +
                ", localDateTime=" + localDateTime +
                '}';
    }
}


