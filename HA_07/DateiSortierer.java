package HA_07;

import java.io.*;

public class DateiSortierer {

    /**
     *
     * @param dateiname Dateiname als String für Datei die eingelesen werde soll
     * @return liefert den Inhalt in der Datei als StringListe zurück
     * @throws DateiNichtGefundenAusnahme Wird geworfen sobald eine "FileNotFound Exception" ausgelöst wird
     * @throws IOException
     */
    public StringListe einlesen(String dateiname) throws DateiNichtGefundenAusnahme, IOException {
        StringListe stringListe = new StringListe(); // neue StringListe erzeugen


            try {
                BufferedReader br = new BufferedReader(new FileReader(dateiname));
                try {
                    // Zeile für Zeile lesen
                    String line;
                    while ((line = br.readLine()) != null) {
                        // Jede Zeile ist ein neuer Eintrag der StringListe
                        stringListe.add(line);
                    }
                }  finally {
                    br.close();
                }
            } catch (FileNotFoundException e){
                throw new DateiNichtGefundenAusnahme(dateiname);
            }
        return stringListe;
    }

    /***
     *
     * @param unsortierteListe Als Eingabe eine unsortierte StringListe
     * @return Liefert die StringListe der Eingabe sortiert zurück
     */
    public StringListe sortiere(StringListe unsortierteListe){
        if (unsortierteListe == null) throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
        StringListe sortierteListe = unsortierteListe;

        // Bubbleesort wird verwendet
        for(int i =0; i<sortierteListe.size();i++){
            boolean sorted = true; // Bollean "sorted" --> solange false ist die Lite nicht sortiert
            for (int j =0; j<sortierteListe.size()-1-i;j++){
                if (sortierteListe.get(j).compareTo(sortierteListe.get(j+1))>0){ // wenn linker Eintrag größer --> vertausche
                    String temp = sortierteListe.get(j);
                    sortierteListe.set(j,sortierteListe.get(j+1));
                    sortierteListe.set(j+1, temp);
                    sorted = false; // Liste ist nicht sortiert, weil Vertauschung durchgeführt wurde
                }
            }
            if(sorted){
                return sortierteListe;  // liefer sortierte Liste zurück
            }
        }
        return sortierteListe;

    }

    /**
     *
     * @param out Der gewünschte OutputStream
     * @param zeilen Die StringListe, welche ausgegeben werden soll
     */
    public void gebeAus(OutputStream out, StringListe zeilen) {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        try {
            try {
                // Jeder Eintrage der StringListe wird als neue Zeile (.newLine()) im writer geschrieben
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

    /***
     *
     * @param dateiname Name der Datei, die geordnet werden soll
     */

    public void sortiereDatei(String dateiname) {

        try{
            StringListe unsorted = this.einlesen(dateiname);
            sortiere(unsorted);
            for (String s:unsorted){
                System.out.print(s +" ");
            }
        } catch (DateiNichtGefundenAusnahme e){
            System.err.println("Die Datei " + e.liefereDateinamen()+" konnte nicht gefunden werden.");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
