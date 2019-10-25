package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private String naziv;
    private double cijena;
    private String kod;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikl artikl = (Artikl) o;
        return Double.compare(artikl.cijena, cijena) == 0 &&
                Objects.equals(naziv, artikl.naziv) &&
                Objects.equals(kod, artikl.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naziv, cijena, kod);
    }

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
