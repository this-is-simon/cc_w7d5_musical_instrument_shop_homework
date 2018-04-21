package MusicalInstrumentShop.OtherStock;

import MusicalInstrumentShop.AgeGroup;

public abstract class LearningMaterials {

    protected AgeGroup ageGroup;
    protected double buyingPrice;
    protected double sellingPrice;

    public LearningMaterials(AgeGroup agegroup, double buyingPrice, double sellingPrice){
        this.ageGroup = agegroup;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice(){
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public AgeGroup getAgeGroup() {
        return this.ageGroup;
    }

    public double calculateMarkup(double sellingPrice, double buyingPrice){
        return sellingPrice - buyingPrice;
    }
}
