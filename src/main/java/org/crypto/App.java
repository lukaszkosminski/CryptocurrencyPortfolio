package org.crypto;

import org.crypto.domain.coin.Coin;
import org.crypto.domain.coin.CoinName;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        Coin coin = new Coin(CoinName.BTC);
    }
}
