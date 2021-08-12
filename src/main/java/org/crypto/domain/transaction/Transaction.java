package org.crypto.domain.transaction;

import org.crypto.domain.coin.Coin;

import java.time.LocalDateTime;

public class Transaction {
    private long id;
    TransactionType transactionType;
    Coin coin;
    private int priceUSD;
    private int amount;
    LocalDateTime localDateTime;

    public Transaction(long id, TransactionType transactionType, Coin coin, int priceUSD, int amount, LocalDateTime localDateTime) {
        this.id = id;
        this.transactionType = transactionType;
        this.coin = coin;
        this.priceUSD = priceUSD;
        this.amount = amount;
        this.localDateTime = localDateTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public int getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(int priceUSD) {
        this.priceUSD = priceUSD;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
