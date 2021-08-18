package com.example.CryptocurrencyPortfolio.domain.transaction;



import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TransactionRepository {
    private List<com.example.CryptocurrencyPortfolio.domain.transaction.Transaction> transactions = new ArrayList<>();

    public com.example.CryptocurrencyPortfolio.domain.transaction.Transaction createNewTransaction(String transactionType, String coin, int priceUSD, int amount){
        long l = ThreadLocalRandom.current().nextLong(0, 100000000);
        LocalDateTime localDateTime = LocalDateTime.now();
        com.example.CryptocurrencyPortfolio.domain.transaction.Transaction newTransaction = new com.example.CryptocurrencyPortfolio.domain.transaction.Transaction(l, transactionType, coin,priceUSD, amount,localDateTime);
        transactions.add(newTransaction);
        return newTransaction;
    }

    public List<com.example.CryptocurrencyPortfolio.domain.transaction.Transaction> getTransactions() {
        return transactions;
    }

    public void saveJson() throws IOException {
        Gson gson = new Gson();
        FileWriter fw = new FileWriter("./transactions.json");
        gson.toJson(this.transactions,fw);
        fw.flush();
        fw.close();
    }
    public void readJson() throws FileNotFoundException {
        Gson gson = new Gson();
        FileReader fr = new FileReader("./transactions.json");
        List<com.example.CryptocurrencyPortfolio.domain.transaction.Transaction> loadedTransaction= gson.fromJson(fr,new TypeToken<List<com.example.CryptocurrencyPortfolio.domain.transaction.Transaction>>() {}.getType());
        this.transactions.addAll(loadedTransaction);
        this.transactions.forEach(transaction -> {
            System.out.println("załadowano transakcje");
        });
    }

}
