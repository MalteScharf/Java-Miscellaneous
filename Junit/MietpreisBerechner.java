package Junit;

public class MietpreisBerechner {
    // Hier einen javadoc - Kommentar einfuegen
    public long berechneMietpreis(int tage, int km) {
        long preis = 0;
        if (tage <14 && km <= 200){
            preis = tage * 2000 + 4000;
        }
        if (tage <14 && km > 200){
            preis = tage * 2000 + 4000 + (km-200) * 15;
        }
        if (tage >=14){
            preis = 30000 + 12 *km;
        }



        return preis;
    }
}
