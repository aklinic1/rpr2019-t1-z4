package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl artikli[] = new Artikl[1000];
    int broj_artikala=0;



    public  void dodajArtikl(String ime, double cijena, String kod){
        Artikl novi =  new Artikl(ime, cijena, kod);
        artikli[broj_artikala]=novi;
        broj_artikala++;
    }
    public void dodajArtikl(Artikl artikl) {
        artikli[broj_artikala]=artikl;
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

    public Artikl izbaciArtiklSaKodom(String kod) {
        int i,j=0;
        Artikl a = null;
        Artikl temp[] = new Artikl[50];
        for(i=0;i<broj_artikala;i++){
            if(!artikli[i].getKod().equals(kod)) {
                temp[j] = artikli[i];
                j++;
            }
            else a = artikli[i];
        }

        artikli=temp;
        broj_artikala=j;
        return a;
    }
}

