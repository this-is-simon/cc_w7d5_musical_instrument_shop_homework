package MusicalInstrumentShop;

import sun.security.krb5.internal.Ticket;

import javax.print.attribute.standard.Destination;
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

    public double calculateShopTotalMarkup(ArrayList<ISell> stock){
        double runningTotal = 0.0;
        for(ISell item : stock) {
            runningTotal += item.calculateMarkup(item.getBuyingPrice(),  item.getSellingPrice());}
        return runningTotal;
    }

}
