package HA04;

class EinfacheZahlenfrage extends AbstrakteZahlenfrage{
    int richtigeAntwort;
    public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort){
        super(frage,punkte);
        this.richtigeAntwort = richtigeAntwort;
    }

    public boolean istRichtigBeantwortet(){
        if (this.istBeantwortet && this.antwort == richtigeAntwort) return true;
        return false;
    }

}
