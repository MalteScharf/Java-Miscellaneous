package HA_07;

import java.io.IOException;

public class DateiSortiererTest {
    public static void main(String[] args) throws DateiNichtGefundenAusnahme, IOException {
        String dateiname = "/Users/maltescharf/Documents/Programming Projects/Java-Miscellaneous/HA_07/Input.txt";
        DateiSortierer dateiSortierer = new DateiSortierer();
        StringListe list = dateiSortierer.einlesen(dateiname);
        System.out.println(list.get(1));
    }

}
