package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private double cijena;
    private String kod;

    public Artikl(String naziv, double cijena, String kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public double getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }
}
