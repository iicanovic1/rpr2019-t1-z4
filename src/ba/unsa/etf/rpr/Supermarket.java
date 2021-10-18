package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {


    ArrayList<Artikl> artikliSupermarketa = new ArrayList<Artikl>(1000);

    void dodajArtikl (Artikl novi){
        artikliSupermarketa.add(novi);
    }

    public ArrayList<Artikl> getArtikli() {
        return artikliSupermarketa;
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
