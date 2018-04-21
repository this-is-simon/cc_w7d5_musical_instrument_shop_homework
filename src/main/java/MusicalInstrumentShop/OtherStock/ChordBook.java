package MusicalInstrumentShop.OtherStock;

import MusicalInstrumentShop.AgeGroup;
import MusicalInstrumentShop.ISell;

public class ChordBook extends LearningMaterials implements ISell {

    private String title;

    public ChordBook(AgeGroup agegroup, double buyingPrice, double sellingPrice, String title){
        super(agegroup, buyingPrice, sellingPrice);
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public AgeGroup getAgeGroup(){
        return this.ageGroup;
    }

}
