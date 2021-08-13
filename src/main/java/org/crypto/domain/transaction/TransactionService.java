package org.crypto.domain.transaction;

import org.crypto.domain.coin.Coin;
import org.crypto.domain.coin.CoinName;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

public class TransactionService{

         private TransactionRepository transactionRepository =new TransactionRepository();

         public Transaction createNewTransaction(String transactionType, String nameCoin, int priceUSD, int amount){

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
