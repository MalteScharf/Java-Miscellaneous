package HA_07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DateiSortiererTestEigen {
    public static void main(String[] args) throws DateiNichtGefundenAusnahme, IOException {
        String outPath = "/Users/maltescharf/Documents/Programming Projects/Java-Miscellaneous/HA_07/Output.txt";
        OutputStream out = new FileOutputStream(outPath);

        DateiSortierer dateiSortierer = new DateiSortierer();
        StringListe list = dateiSortierer.einlesen("Input.txt");
        for(String s: list){
            System.out.print(s+" ");
        }
        System.out.println(" ");
        StringListe output = dateiSortierer.sortiere(list);
        for(String s: output){
            System.out.print(s+" ");
        }
        dateiSortierer.gebeAus(out,list);
        dateiSortierer.sortiereDatei(outPath);
    }

}
