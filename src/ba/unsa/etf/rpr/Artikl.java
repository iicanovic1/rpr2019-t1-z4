package ba.unsa.etf.rpr;

public class Artikl {

    String nazivArtikla;
    Integer cijenaArtikla;
    String kodArtikla;

    public Artikl(){

    }

    public String getNaziv() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public Integer getCijena() {
        return cijenaArtikla;
    }

    public void setCijenaArtikla(Integer cijenaArtikla) {
        this.cijenaArtikla = cijenaArtikla;
    }

    public String getKod() {
        return kodArtikla;
    }

    public void setKodArtikla(String kodArtikla) {
        this.kodArtikla = kodArtikla;
    }


    public Artikl(String biciklo, Integer cijena, String kod) {
        nazivArtikla = biciklo;
        cijenaArtikla = cijena;
        kodArtikla = kod;
    }



}
