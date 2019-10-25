package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
   // private Korpa korpa;
    //private Artikl artikl;



    @Test
    void testDodavanja1() {
        Korpa korpa=new Korpa();
        Artikl a=new Artikl("biciklo", 100, "121");
        korpa.dodajArtikl(a);
        boolean moze_se_dodati=korpa.dodajArtikl(a);
        assertTrue(moze_se_dodati);
    }

    @Test
    void name() {
        Korpa korpa = new Korpa();
        Artikl a = new Artikl("biciklo", 100, "121");
        Artikl izbacen = korpa.izbaciArtiklSaKodom("122");
        assertNull(izbacen);

        assertAll(
                "test", () -> assertNull(izbacen),
                () -> assertEquals(0, korpa.getBroj_artikala())
        );
    }

    @Test
    void Ubaci51() {
        int i;
        Korpa korpa = new Korpa();
        for (i = 0; i < 50; i++) {
            korpa.dodajArtikl(new Artikl("mlijeko", i + 100, String.valueOf(i + 1)));
        }
        boolean a = korpa.dodajArtikl(new Artikl("mlijeko", 120, "51"));
        assertFalse(a);
    }
}

