package MusicalInstrumentShop;

import java.util.ArrayList;

public class Shop {

    protected ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock){
        this.stock = stock;
    }

    public int getStockSize(){
        return stock.size();
    }

}
