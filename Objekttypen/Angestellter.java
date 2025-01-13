package Objekttypen;

public class Angestellter {
    String name;
    double gehalt;
    Abteilung abteilung;

    Angestellter(String name, double gehalt, Abteilung abteilung){
        this.name = name;
        this.gehalt = gehalt;
        this.abteilung = abteilung;
    }

    String liefereNamen(){
        return this.name;
    }

    double liefereGehalt(){
        return this.gehalt;
    }

    Abteilung liefereAbteilung(){
        return this.abteilung;
    }
    void erhoeheGehalt(double prozentsatz){
        this.gehalt *= (1 +prozentsatz);
    }

}
