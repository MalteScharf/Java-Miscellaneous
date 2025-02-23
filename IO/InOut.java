package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOut {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            try {
// erste Zeile einlesen
                String line = br.readLine();
// solange nicht "Ende" eingelesen wird
                while (line != null && !"Ende".equals(line)) {
// Zeichenkette verarbeiten
// ...
// nächste Zeile einlesen
                    line = br.readLine();
                }
            } finally {
// Datenstrom schließen
                br.close();
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Einlesen.");
        }
    }
}
