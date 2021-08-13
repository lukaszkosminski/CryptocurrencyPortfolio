package org.crypto;

import org.crypto.consoleApp.ConsoleApp;
import org.crypto.domain.coin.Coin;
import org.crypto.domain.coin.CoinName;
import org.crypto.domain.transaction.Transaction;
import org.crypto.domain.transaction.TransactionRepository;
import org.crypto.domain.transaction.TransactionType;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) throws IOException {
//        TransactionRepository transactionRepository = new TransactionRepository();
//        Transaction newTransaction = transactionRepository.createNewTransaction(TransactionType.BUY, new Coin(CoinName.BTC), 1500, 2, LocalDateTime.now());
//        Transaction newTransaction2 = transactionRepository.createNewTransaction(TransactionType.SELL, new Coin(CoinName.BTC), 1500, 2, LocalDateTime.now());
//        System.out.println(transactionRepository.getTransactions());
        ConsoleApp consoleApp = new ConsoleApp();
        consoleApp.init();

    }
}
