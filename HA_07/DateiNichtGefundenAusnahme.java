package HA_07;

public class DateiNichtGefundenAusnahme extends Exception{
    // Variable dateinahme einführen
    String dateiname;

    // Konstruktor erstllen mit Parameter "String"
    DateiNichtGefundenAusnahme(String string){
        super("Datei wurde nicht gefunden."); // falls Ausnahme geworfen wird, erscheint Fehlermeldung in dem Konstruktor von Exception (Superklasse aufgerufen wird)
        this.dateiname = string;  // Wert von übergenen String wird in Variable dateiname gespeichert
    }

    public String liefereDateinamen(){
        return this.dateiname; //liefert dateiname zurück
    }

}
