package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtiklPlusGetArtikli() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        assertEquals(supermarket.getArtikli()[0].nazivArtikla, "Biciklo");
    }


    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Traktor", 2000, "3"));
        supermarket.izbaciArtiklSaKodom("1");
        assertEquals(supermarket.getArtikli()[0].nazivArtikla, "Traktor");
        assertEquals( supermarket.izbaciArtiklSaKodom("5").nazivArtikla,null );
    }
}