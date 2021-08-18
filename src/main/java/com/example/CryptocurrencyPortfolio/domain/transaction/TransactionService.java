package com.example.CryptocurrencyPortfolio.domain.transaction;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TransactionService{

    private com.example.CryptocurrencyPortfolio.domain.transaction.TransactionRepository transactionRepository =new com.example.CryptocurrencyPortfolio.domain.transaction.TransactionRepository();

    public com.example.CryptocurrencyPortfolio.domain.transaction.Transaction createNewTransaction(String transactionType, String nameCoin, int priceUSD, int amount){

        return this.transactionRepository.createNewTransaction(transactionType,nameCoin, priceUSD,amount);

    }
    public void  printTransactions(){
        System.out.println(this.transactionRepository.getTransactions());
    }
    public void saveJson() throws IOException {
        this.transactionRepository.saveJson();
    }
    public void readJson() throws FileNotFoundException {
        this.transactionRepository.readJson();
    }



}