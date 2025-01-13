package Objekttypen;

public class RechnungTest {
    public static void main(String[] args){
        Rechnung rechnung = new Rechnung();
        //rechnung.fuegePostenHinzu(2,1.0);
        rechnung.legeRabattFest(0.1);
        rechnung.gebeAus();
    }
}
