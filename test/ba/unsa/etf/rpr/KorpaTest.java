package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklPlusGetArtikli() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Traktor", 5000, "6"));
        assertEquals(korpa.getArtikli()[0].nazivArtikla, "Traktor");

    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Traktor", 5000, "6"));
        korpa.izbaciArtiklSaKodom("6");
        assertEquals(korpa.getArtikli().length, 0);
        assertEquals(korpa.izbaciArtiklSaKodom("6").nazivArtikla, null);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Traktor", 5000, "6"));
        korpa.dodajArtikl(new Artikl("Auto", 2000, "8"));
        assertEquals(korpa.dajUkupnuCijenuArtikala(), 7000);
    }
}