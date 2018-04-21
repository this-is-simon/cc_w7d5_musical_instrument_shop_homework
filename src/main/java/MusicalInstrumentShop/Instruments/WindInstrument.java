package MusicalInstrumentShop.Instruments;

public abstract class WindInstrument {

    protected InstrumentType type;
    protected int numberOfValves;
    protected double buyingPrice;
    protected double sellingPrice;

    public WindInstrument(InstrumentType type, int numberOfValves, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.numberOfValves = numberOfValves;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfValves(){
        return this.numberOfValves;
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
}
