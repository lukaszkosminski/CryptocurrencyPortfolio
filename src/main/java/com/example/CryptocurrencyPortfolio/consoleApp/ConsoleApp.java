package com.example.CryptocurrencyPortfolio.consoleApp;

import com.example.CryptocurrencyPortfolio.domain.transaction.TransactionService;


import java.io.IOException;
import java.util.Scanner;

public class ConsoleApp {
    private TransactionService transactionService = new TransactionService();

    public void init() throws IOException {
        System.out.println("witamy w aplikacji CryptoCurrency portfolio!");
        this.transactionService.readJson();
        System.out.println("wybierz operacje");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while(option !=0){
            System.out.println("1. Dodaj nowa transakcje");
            System.out.println("2. Wyswietl historie transakcji");
            System.out.println("0. Wyjdz z programu");
            option = Integer.parseInt(scanner.nextLine());
            if(option == 1){
                this.handleCreateNewTransaction();
            }
            if (option == 2){
                System.out.println("odczyt");
                transactionService.printTransactions();

            }else if (option == 0){
                System.out.println("zapisuje dane");
                this.transactionService.saveJson();

                System.out.println("konce dzialanie programu");
            }
        }


    }
    private void handleCreateNewTransaction() {
        Scanner scannerCreateNewTransaction = new Scanner(System.in);
        System.out.println("Podaj rodzaj transakcji - kup/sprzedaj");
        String type = scannerCreateNewTransaction.nextLine();
        System.out.println("Podaj nazwe kryptowaluty");
        String nameCoin = scannerCreateNewTransaction.nextLine();
        System.out.println("Podaj kurs w USD");
        int priceUsd = scannerCreateNewTransaction.nextInt();
        System.out.println("Podaj ilość sztuk zakupionej kryptowaluty");
        int amount =scannerCreateNewTransaction.nextInt();

        this.transactionService.createNewTransaction(type,nameCoin, priceUsd,amount);
    }

}