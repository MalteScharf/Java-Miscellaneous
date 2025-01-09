package Objekttypen;

public class KundeTest {
    public static void main(String[] args){
        Kunde kunde2 = new Kunde("Peter","12342");
        Kunde kunde3 = new Kunde("Ingolo","12343");
        kunde2.anschrift = kunde3.anschrift;
        Rechnung rechnung = new Rechnung();
    }
}
