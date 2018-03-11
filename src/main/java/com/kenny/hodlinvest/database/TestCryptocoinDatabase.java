package com.kenny.hodlinvest.database;

import com.kenny.hodlinvest.model.Cryptocoin;

import java.util.List;

public class TestCryptocoinDatabase implements CryptocoinDatabase {
    @Override
    public int insertCryptocoin(String ticker, Cryptocoin cryptocoin) {
        return 0;
    }

    @Override
    public Cryptocoin getCryptocoin(String ticker) {
        return null;
    }

    @Override
    public List<Cryptocoin> selectAllCryptocoin() {
        return null;
    }

    @Override
    public int updateCryptocoin(String ticker, Cryptocoin cryptocoin) {
        return 0;
    }

    @Override
    public int deleteCryptocoin(String ticker) {
        return 0;
    }
}
