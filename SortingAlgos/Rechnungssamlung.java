package SortingAlgos;

import IO.Rechner;

public class Rechnungssamlung {
    private Rechnung[] rechnungen;

    int bestimmeGesamtbetragAllerRechnungenvon(Kunde k){
        int betrag =0;

        if(k == null || rechnungen == null) return 0;

        for(Rechnung r:this.rechnungen){
            if (r.liefereRechnungsempfaenger().equals(k.liefereName())){
                betrag += r.berechneNettopreis();
            }
        }
        return betrag;
    }

    Rechnung findeTeuersteRechung(){
        if (rechnungen == null) throw new IllegalArgumentException();
        Rechnung teuersteRechung = rechnungen[0];
        for (Rechnung r:rechnungen){
            if (r.betrag>teuersteRechung.betrag) teuersteRechung = r;

        }
        return teuersteRechung;
    }

}
