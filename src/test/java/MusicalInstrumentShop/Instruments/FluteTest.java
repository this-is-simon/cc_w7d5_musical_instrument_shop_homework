package MusicalInstrumentShop.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FluteTest {

    Flute flute1;

    @Before
    public void before(){
        flute1 = new Flute(InstrumentType.WIND, 10, 200.0, 369.99);
    }

    @Test
    public void canMakeMusic(){
        assertEquals("Faloofaloo! I am making music.", flute1.makeSound("Faloofaloo"));
    }

}