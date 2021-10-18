package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {

    ArrayList<Artikl> artikliSupermarketa = new ArrayList<Artikl>(50);

    public boolean dodajArtikl(Artikl a) {
        artikliSupermarketa.add(a);
        return true;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikliSupermarketa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i=0; i<artikliSupermarketa.size()-1; i++){
            if(artikliSupermarketa.get(i).kodArtikla.equals(kod)){
                Artikl zaIzbaciti = artikliSupermarketa.get(i);
                artikliSupermarketa.remove(i);
                return zaIzbaciti;
            }
        }
        return new Artikl();
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i=0; i<artikliSupermarketa.size()-1; i++ ){
            if (artikliSupermarketa.get(i) != null)
                suma +=  artikliSupermarketa.get(i).cijenaArtikla;
        }
        return suma;
    }
}
