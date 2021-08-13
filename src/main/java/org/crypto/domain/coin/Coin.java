package org.crypto.domain.coin;

public class Coin {
    String coinName;

    public Coin(String coinName) {
        this.coinName = coinName;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinName='" + coinName + '\'' +
                '}';
    }
}
