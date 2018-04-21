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

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        stock.remove(item);
    }

}
