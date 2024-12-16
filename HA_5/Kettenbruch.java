package HA_5;

public class Kettenbruch {

    // die lineare Darstellung des Kettenbruchs
    private int[] werte;

    /**
     * erzeugt einen Kettenbruch aus der linearen Darstellung
     * @param werte
     */
    public Kettenbruch(int[] werte) {
        this.werte = werte;
    }


    /**
     * berechnet rekursiv den Wert des Kettenbruchs
     * @return den rekursiv berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
     */
    public double werteRekursivAus() {
        // Aufruf von Hilfsfunktion mit Übergabe von "werte" und start
        return berechneKettenbruch(this.werte,0);
    }

    /**
     * berechnet iterativ den Wert des Kettenbruchs
     * @return den iterativ berechneten Wert des Kettenbruchs, bei fehlenden Werten 0
     */
    public double werteIterativAus() {
        double wert = 0;
        // wenn Array mit Größe 0 übergeben wird, gebe 0 zurück
        if (werte.length == 0) return 0;
        // wenn Länge der Liste größer 1 ist
        if (this.werte.length >1){
            // Kettenbruch itervativ berechen, vom letzten Eintrag startend und rückwärts einsetzen
            for (int i = this.werte.length-1;  i >= 1 ;i--){
                wert = 1/(this.werte[i]+wert);
            }
        }

        // erster Eintrag des Feldes muss nicht mehr durch 1 geteilt werden
        wert = wert + this.werte[0];

        return wert;
    }

    /**
     * approximiert den Wert der Quadratwurzel von 2 mit Hilfe der Kettenbruchdarstellung mit n Elementen
     * @param n die Anzahl der fuer die Approximation verwendeten Elemente
     * @return der approximierte Wert von Wurzel 2
     */
    public static double approximiereWurzel2(int n) {
        return berechneKettenbruch(berechneWurzel2Folge(n),0) ;
    }

    /**
     * approximiert den Wert der eulerschen Zahl mit Hilfe der Kettenbruchdarstellung mit n Elementen
     * @param n die Anzahl der fuer die Approximation verwendeten Elemente
     * @return der approximierte Wert fuer die eulersche Zahl
     */
    public static double approximiereE(int n) {
        return berechneKettenbruch(berechneEFolge(n),0);
    }

    /**
     * berechnet die Folge fuer die Kettenbruch-Darstellung der Quadratwurzel von 2 mit den ersten n Elementen
     * @param n die Anzahl der Elemente
     * @return die Folge als Array, bei n <= 0 ein leeres Array
     */
    public static int[] berechneWurzel2Folge(int n) {
        int[] wurzel2Folge = new int[n];

        // return leeres Array falls n <= 0
        if (n <= 0) return new int[0];

        // Zuweisung des ersten Eintrags
        wurzel2Folge[0] = 1;
        // alle anderen Einträge sind 2
        for(int i =1;i<wurzel2Folge.length;i++){
            wurzel2Folge[i] = 2;
        }

        return wurzel2Folge;
    }

    /**
     * berechnet die Folge fuer die Kettenbruch-Darstellung der eulerschen Zahl mit den ersten n Elementen
     * @param n die Anzahl der Elemente
     * @return die Folge als Array,  bei n <= 0 ein leeres Array
     */
    public static int[] berechneEFolge(int n) {

        // return leeres Array falls n <= 0
        if (n <= 0) return new int[0];

        // Werte für ungleich 2 initialisieren
        int wert = 2;

        int[] EFolge = new int[n];
        // ersten Wert zuweisen
        EFolge[0] = 2;

        // jeden Dritten Eintrag mit werr = wert +2 zuweisen
        for(int i =1;i<EFolge.length;i++){
            if((i+1) % 3 ==0){
                EFolge[i] =wert;
                wert = wert+2;
            }
            else EFolge[i] =1;
        }

        return EFolge;
    }


    /* Hilfsmethoden */
    public static double berechneKettenbruch(int[] werte, int i){
        // wenn Array mit Größe 0 übergeben wird, gebe 0 zurück
        if (werte.length == 0) return 0;

        // Basisfall: letzter Eintrag von int[] werte erreicht
        if (i == werte.length-1) return werte[i];
        // sonst: rekursiver Aufruf
        return werte[i] + 1/berechneKettenbruch(werte, i+1);
    }
}
