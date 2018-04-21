import MusicalInstrumentShop.Instruments.Guitar;
import MusicalInstrumentShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static com.sun.tools.doclint.Entity.delta;
import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before(){
        guitar1 = new Guitar(InstrumentType.STRING, 6, 100.0, 200.0);
        guitar2 = new Guitar(InstrumentType.STRING, 12, 500.0, 700.0);
    }

    @Test
    public void guitarHasSellingPrice(){
        assertEquals(200.0, guitar1.getSellingPrice(),0.01);
    }

    @Test
    public void guitarCanMakeSound(){
        assertEquals("Kachow! I am making music.", guitar1.makeSound("Kachow"));
    }

}