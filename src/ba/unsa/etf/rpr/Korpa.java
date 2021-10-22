package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {

    ArrayList<Artikl> artikliKorpe = new ArrayList<>(50);

    public boolean dodajArtikl(Artikl a) {
        artikliKorpe.add(a);
        return true;
    }

    public Artikl[] getArtikli() {
        return artikliKorpe.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i< artikliKorpe.size(); i++){
            if(artikliKorpe.get(i).kodArtikla.equals(kod)){
                Artikl zaIzbaciti = artikliKorpe.get(i);
                artikliKorpe.remove(i);
                return zaIzbaciti;
            }
        }
        return new Artikl();
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl artikl : artikliKorpe) {
            suma += artikl.cijenaArtikla;
        }
        return suma;
    }
}
