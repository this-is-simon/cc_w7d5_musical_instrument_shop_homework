package MusicalInstrumentShop.Instruments;

import MusicalInstrumentShop.ISell;

public abstract class StringInstrument implements ISell {

    private InstrumentType type;
    private int numberOfStrings;
    private double buyingPrice;
    private double sellingPrice;

    public StringInstrument(InstrumentType type, int numberOfStrings, double buyingPrice, double sellingPrice){
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public String makeSound(String sound){
        String music = sound + "! I am making music.";
        System.out.println(music);
        return music;
    }

    public double calculateMarkup(double buyingPrice, double sellingPrice){
        return sellingPrice - buyingPrice;
    }

}
