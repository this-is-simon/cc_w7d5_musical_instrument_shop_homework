package MusicalInstrumentShop;

public interface ISell {

    public double calculateMarkup(double buyingPrice, double sellingPrice);

    public double getBuyingPrice();

    public double getSellingPrice();

}
