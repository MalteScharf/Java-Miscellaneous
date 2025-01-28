package HA04;

class SchaetzFrage extends AbstrakteZahlenfrage{
    int prozentualeAbweichung;
    int richtigeAntwort;

    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung){
        super(frage,punkte);
        this.prozentualeAbweichung = prozentualeAbweichung;
        this.richtigeAntwort = richtigeAntwort;
    }

    public boolean istRichtigBeantwortet(){
        if (this.istBeantwortet && antwort >= richtigeAntwort *(100-prozentualeAbweichung)/100 && antwort <= (richtigeAntwort *(100+prozentualeAbweichung)/100)) return true;
        return false;
        }
}

