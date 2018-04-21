package MusicalInstrumentShop.Instruments;

import MusicalInstrumentShop.ISell;

public class Guitar extends StringInstrument {

    public Guitar(InstrumentType type, int numberOfStrings, double buyingPrice, double sellingPrice){
        super(type, numberOfStrings, buyingPrice, sellingPrice);
    }

    public double markupCanBeCalculated(double buyingPrice, double sellingPrice){
        return sellingPrice - buyingPrice;
    }

}
