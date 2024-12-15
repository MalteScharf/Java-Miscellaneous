package HA_5;

class UngueltigeTagesanzahlAusnahme extends Exception {
    UngueltigeTagesanzahlAusnahme(int tage){
        super("Tagesanzahl größer Null benötigt. Eingabe von "+ tage +" nicht möglich.");
    }
}
