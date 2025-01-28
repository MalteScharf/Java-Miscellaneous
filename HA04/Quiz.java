package HA04;

class Quiz {
    Zahlenfrage[] fragen;
    int aktuelleAnzahlFragen = 0;
    public Quiz(int fragenAnzahl){
        fragen = new Zahlenfrage[fragenAnzahl];
    }

    public boolean fuegeFrageHinzu(Zahlenfrage f){
        if (f == null) return  false;
        if (aktuelleAnzahlFragen == fragen.length) return false;
        fragen[aktuelleAnzahlFragen] = f;
        aktuelleAnzahlFragen++;
        return true;
    }

    public int berechneErreichtePunkte(){
        int erreichtePunkte =0;
        for(int i=0; i< aktuelleAnzahlFragen;i++){
            erreichtePunkte += fragen[i].liefereErreichtePunkte();
        }
        return erreichtePunkte;
    }

    public int berechneMaximalMoeglichePunkte(){
        int maximalPunkte = 0;
        if (aktuelleAnzahlFragen == 0) return 0;
        for(int i =0; i<aktuelleAnzahlFragen; i++){
            maximalPunkte += fragen[i].liefereMoeglichePunkte();
        }
        return maximalPunkte;
    }

    public Zahlenfrage liefereFrage(int index){
        if (index <0) return null;
        if (index>aktuelleAnzahlFragen) return null;
        return fragen[index];
    }

    public int liefereFragenAnzahl(){
        return aktuelleAnzahlFragen;
    }
}
