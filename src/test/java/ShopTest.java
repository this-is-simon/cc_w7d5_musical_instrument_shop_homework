import MusicalInstrumentShop.AgeGroup;
import MusicalInstrumentShop.ISell;
import MusicalInstrumentShop.Instruments.Guitar;
import MusicalInstrumentShop.Instruments.InstrumentType;
import MusicalInstrumentShop.Instruments.Violin;
import MusicalInstrumentShop.OtherStock.ChordBook;
import MusicalInstrumentShop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop1;
    Guitar guitar1;
    Guitar guitar2;
    Violin violin1;
    ChordBook chordBook1;

    @Before
    public void before(){
        guitar1 = new Guitar(InstrumentType.STRING, 6, 100.0, 200.0);
        guitar2 = new Guitar(InstrumentType.STRING, 6, 100.0, 300.0);
        violin1 = new Violin(InstrumentType.STRING, 6, 150.0, 200.0);
        chordBook1 = new ChordBook(AgeGroup.ADULT, 5.0, 10.0, "Chords for Guitar");
        ArrayList<ISell> stock = new ArrayList<>();
        stock.add(guitar1);
        stock.add(guitar2);
        shop1 = new Shop(stock);
    }

    @Test
    public void shopHasStock(){
        assertEquals(2, shop1.getStockSize());
    }

    @Test
    public void canAddToStock(){
        shop1.addItemToStock(chordBook1);
        assertEquals(3, shop1.getStockSize());
    }

    @Test
    public void canRemoveFromStock(){
        shop1.removeItemFromStock(guitar1);
        assertEquals(1, shop1.getStockSize());
    }

    @Test
    public void canAddTotalStockMarkup(){
        shop1.addItemToStock(chordBook1);
        assertEquals(305.0, shop1.calculateShopTotalMarkup(shop1.getStock()), 0.01);
    }

}