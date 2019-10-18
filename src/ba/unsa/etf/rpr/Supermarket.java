package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl artikli[] = new Artikl[1000];
    int broj_artikala=0;



    public  void dodajArtikl(String ime, double cijena, int kod){
        Artikl novi =  new Artikl(ime, cijena, kod);
        artikli[broj_artikala]=novi;
        broj_artikala++;
    }

    public Artikl[] getArtikli() { return artikli; }
    public int getBrojArtikala() { return broj_artikala; }

    public void ispisArtikala(Artikl artikli[]){
        int i;
        for(i=0;i<broj_artikala;i++){
            Artikl temp = artikli[i];
            System.out.println(temp.getNaziv() + " " + temp.getCijena() + " " +temp.getKod() + "\n");
        }
    }
}
