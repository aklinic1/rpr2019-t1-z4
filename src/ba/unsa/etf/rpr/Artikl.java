package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private double cijena;
    private int kod;

    public Artikl(String naziv, double cijena, int kod){
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public double getCijena() {
        return cijena;
    }

    public int getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }
}
