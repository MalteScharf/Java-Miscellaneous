package HA_07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;

public class DateiSortierer {

    public StringListe einlesen(String dateiname) throws IOException, DateiNichtGefundenAusnahme {
        StringListe stringListe = new StringListe(); // neue StringListe erzeugen
        BufferedReader br = new BufferedReader(new FileReader(dateiname));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                stringListe.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new DateiNichtGefundenAusnahme(dateiname);
        }
        finally {
            br.close();
        }

        return stringListe;
    }
}
