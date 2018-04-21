package MusicalInstrumentShop.Instruments;

import MusicalInstrumentShop.ISell;

public class Violin extends StringInstrument {

    public Violin(InstrumentType type, int numberOfStrings, double buyingPrice, double sellingPrice){
        super(type, numberOfStrings, buyingPrice, sellingPrice);
    }

    public double markupCanBeCalculated(double buyingPrice, double sellingPrice){
        return sellingPrice - buyingPrice;
    }
}
