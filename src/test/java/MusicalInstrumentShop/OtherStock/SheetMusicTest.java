package MusicalInstrumentShop.OtherStock;

import MusicalInstrumentShop.AgeGroup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic1;

    @Before
    public void before(){
        sheetMusic1 = new SheetMusic(AgeGroup.ADULT, 10.0, 20.0,"Really Boring Classical Music");
    }


    @Test
    public void hasTitle(){
        assertEquals("Really Boring Classical Music", sheetMusic1.getTitle());
    };

    @Test
    public void hasSellingPrice(){
        assertEquals(20.0, sheetMusic1.getSellingPrice(), 0.01);
    }
}