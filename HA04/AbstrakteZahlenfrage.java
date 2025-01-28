package HA04;

abstract class AbstrakteZahlenfrage implements Zahlenfrage{
    String frage;
    int punkte;
    int antwort;
    boolean istBeantwortet = false;

    public AbstrakteZahlenfrage(String frage , int punkte){
        this.frage = frage;
        this.punkte = punkte;
    }

    public boolean istBeantwortet(){
        return istBeantwortet;
    }

    public void legeAntwortFest(int antwort){
        this.antwort = antwort;
        istBeantwortet = true;
    }

    public int liefereErreichtePunkte(){
        if (this.istBeantwortet() && this.istRichtigBeantwortet()) return this.punkte;
        return 0;
    }

    public String liefereFrage(){
        return this.frage;
    }

    public int liefereMoeglichePunkte(){
        return punkte;
    }


}
