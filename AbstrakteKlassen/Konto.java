package AbstrakteKlassen;

public abstract class Konto {
    double guthaben;
    public Konto(){
        this.guthaben = 0;
    }
    void einzahlen(double betrag){
        if (betrag <0) System.out.print("Es können keine negativen Beträge eingezahlt werden.");
        this.guthaben += betrag;
    }
    abstract void abheben(double betrag);

}
