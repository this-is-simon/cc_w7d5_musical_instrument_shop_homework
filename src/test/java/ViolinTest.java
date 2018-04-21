import MusicalInstrumentShop.Instruments.InstrumentType;
import MusicalInstrumentShop.Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinTest {

    Violin violin1;

    @Before
    public void before(){
        violin1 = new Violin(InstrumentType.STRING, 5, 1000.0, 1499.99);
    }

    @Test
    public void canMakeMusic(){
        assertEquals("Haaweeee! I am making music.", violin1.makeSound("Haaweeee"));
    }

}