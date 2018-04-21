import MusicalInstrumentShop.AgeGroup;
import MusicalInstrumentShop.OtherStock.ChordBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChordBookTest {

    ChordBook chordbook1;

    @Before
    public void before(){
        chordbook1 = new ChordBook(AgeGroup.CHILD, 5.0, 10.0, "Kords for Kids");
    }

    @Test
    public void hasTitle(){
        assertEquals("Kords for Kids", chordbook1.getTitle());
    }

    @Test
    public void hasAgeGroup(){
        assertEquals(AgeGroup.CHILD, chordbook1.getAgeGroup());
    }

}