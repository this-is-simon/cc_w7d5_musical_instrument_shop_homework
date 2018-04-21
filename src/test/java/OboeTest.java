import MusicalInstrumentShop.Instruments.InstrumentType;
import MusicalInstrumentShop.Instruments.Oboe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OboeTest {

    Oboe oboe1;

    @Before
    public void before(){
        oboe1 = new Oboe(InstrumentType.WIND, 12, 200.0, 300.50);
    }

    @Test
    public void hasValves(){
        assertEquals(12, oboe1.getNumberOfValves());
    }

    @Test
    public void canMakeMusic(){
        assertEquals("Toodloo! I am making music.", oboe1.makeSound("Toodloo"));
    }

}