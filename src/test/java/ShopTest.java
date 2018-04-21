import MusicalInstrumentShop.ISell;
import MusicalInstrumentShop.Instruments.Guitar;
import MusicalInstrumentShop.Instruments.InstrumentType;
import MusicalInstrumentShop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop1;
    Guitar guitar1;

    @Before
    public void before(){
        guitar1 = new Guitar(InstrumentType.STRING, 6, 100.0, 200.0);
        ArrayList<ISell> stock = new ArrayList<>();
        stock.add(guitar1);
        shop1 = new Shop(stock);
    }

    @Test
    public void shopHasStock(){
        assertEquals(1, shop1.getStockSize());
    }

}