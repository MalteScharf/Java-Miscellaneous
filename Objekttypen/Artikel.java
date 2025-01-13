package Objekttypen;

public class Artikel {
    long artikelnummer;
    String beschreibung;
    double preis;

    void legeArtikelnummerFest(final long neueNr){
        this.artikelnummer = neueNr;
    }
    void legeBeschreibungFest(final String neueB){
        this.beschreibung = neueB;
    }

    void legePreisFest(double neuerPreis){
        this.preis = neuerPreis;
    }

    long liefereAtrikelnummer(){
        return this.artikelnummer;
    }

    String liefereBeschreibung(){
        return this.beschreibung;
    }

    double lieferePreis(){
        return this.preis;
    }
}
