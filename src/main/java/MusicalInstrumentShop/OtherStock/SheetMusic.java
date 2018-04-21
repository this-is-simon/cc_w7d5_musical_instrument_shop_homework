package MusicalInstrumentShop.OtherStock;

import MusicalInstrumentShop.AgeGroup;

public class SheetMusic extends LearningMaterials {

    protected String title;

    public SheetMusic(AgeGroup agegroup, double buyingPrice, double sellingPrice, String title) {
        super(agegroup, buyingPrice, sellingPrice);
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
