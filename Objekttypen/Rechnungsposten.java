package Objekttypen;

public class Rechnungsposten {
    int anzahl;
    Artikel artikel;

    void legeAnzahlFest(int neueAnzahl){
        this.anzahl = neueAnzahl;
    }

    void legeArtikelFest(Artikel neuerArtikel){
        this.artikel = neuerArtikel;
    }

    double berechneGesamtbetrag(){
        return this.liefereAnzahl() * this.liefereArtikel().lieferePreis();
    }

    Artikel liefereArtikel(){
        return this.artikel;
    }

    int liefereAnzahl(){
        return this.anzahl;
    }

}
