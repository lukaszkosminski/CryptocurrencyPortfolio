package org.crypto.domain.transaction;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.crypto.domain.coin.Coin;
import org.crypto.domain.coin.CoinName;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TransactionRepository {
    private List<Transaction> transactions = new ArrayList<>();

    public Transaction createNewTransaction(String transactionType, String coin, int priceUSD, int amount){
        long l = ThreadLocalRandom.current().nextLong(0, 100000000);
        LocalDateTime localDateTime = LocalDateTime.now();
        Transaction newTransaction = new Transaction(l, transactionType, coin,priceUSD, amount,localDateTime);
        transactions.add(newTransaction);
        return newTransaction;
    }

    public List<Transaction> getTransactions() {
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
        List<Transaction> loadedTransaction= gson.fromJson(fr,new TypeToken<List<Transaction>>() {}.getType());
        this.transactions.addAll(loadedTransaction);
        this.transactions.forEach(transaction -> {
            System.out.println("załadowano transakcje");
        });
    }

}
