package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {


    ArrayList<Artikl> artikliSupermarketa = new ArrayList<>(1000);

    void dodajArtikl (Artikl novi){
        artikliSupermarketa.add(novi);
    }

    public Artikl[] getArtikli() {
        return artikliSupermarketa.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i=0; i<artikliSupermarketa.size(); i++){
            if(artikliSupermarketa.get(i).kodArtikla.equals(kod)){
                Artikl zaIzbaciti = artikliSupermarketa.get(i);
                artikliSupermarketa.remove(i);
                return zaIzbaciti;
            }
        }
        return new Artikl();
    }
}
