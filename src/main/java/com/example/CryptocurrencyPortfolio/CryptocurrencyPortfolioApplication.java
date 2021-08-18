package com.example.CryptocurrencyPortfolio;

import com.example.CryptocurrencyPortfolio.consoleApp.ConsoleApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CryptocurrencyPortfolioApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CryptocurrencyPortfolioApplication.class, args);
		ConsoleApp consoleApp = new ConsoleApp();
		consoleApp.init();
	}

}
