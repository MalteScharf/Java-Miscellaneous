package HA_3;

public class Kunde {

    private String name;

    /**
     * erzeugt einen neuen Kunden mit dem entsprechenden Namen
     * @param n der Name des Kunden
     */
    public Kunde(String n) {
        name = n;
    }

    /**
     * liefert den Namen des Kunden
     * @return der Name des Kunden
     */
    public String liefereName() {
        return name;
    }
}
