package HA_07;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.util.concurrent.RunnableFuture;

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

    public StringListe sortiere(StringListe unsortierteListe){
        if (unsortierteListe == null) throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
        StringListe sortierteListe = unsortierteListe;

        // Bullbesort wird verwendet

        for(int i =0; i<sortierteListe.size();i++){
            boolean sorted = true;
            for (int j =0; j<sortierteListe.size()-1-i;j++){
                if (sortierteListe.get(j).compareTo(sortierteListe.get(j+1))>0){ // wenn linker Eintrag größer --> vertausche
                    String temp = sortierteListe.get(j);
                    sortierteListe.set(j,sortierteListe.get(j+1));
                    sortierteListe.set(j+1, temp);
                    sorted = false; // List ist nicht sortiert, weil Vertauschung durchgeführt wurde
                }
            }
            if(sorted){
                return sortierteListe;  // liefer sortierte Liste zurück
            }
        }
        return sortierteListe;

    }

    public void gebeAus(OutputStream out, StringListe zeilen) {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        try {
            try {
                for (int i = 0; i < zeilen.size(); i++) {
                    writer.write(zeilen.get(i));
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.print("Fehler beim Ein/Auslesen.");
            } finally {
                writer.flush();
                writer.close();
            }
        } catch (IOException e){
            System.err.print("Fehler beim Ein/Auslesen.");
        }

    }

    public void sortiereDatei(String dateiname)  {
        if (dateiname == null || dateiname.isEmpty()) {
            throw new IllegalArgumentException("Dateiname darf nicht null oder leer sein.");
        }

        try {
            StringListe unsorted = this.einlesen(dateiname);
            sortiere(unsorted);
            for (String s:unsorted){
                System.out.print(s +" ");
            }
        } catch (DateiNichtGefundenAusnahme e) {
            System.err.println("Die Datei " + e.liefereDateinamen() + " konnte nicht gefunden werden.");
        } catch (IOException e) {
            // Andere IO-Ausnahmen
            System.err.println(e.getMessage());
        }


    }



}
