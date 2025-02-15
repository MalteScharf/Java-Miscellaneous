package Klausi;

public class Aufg2 {
    /***
     * Es wird für die Funktion x^3 - 150*x^2+5400*x -40000
     * ein Ganzzahlwert 0 und 100 für x gesucht der den größte Wert für die Funktion ergibt
     *
     */
    public static void funktionsAuswertung(){
        // Idee: Brute Force alle Zahlen von 0 bis 100 durchprobieren und das maximum immer speichern
        // Initialisierung des maximums mit Integer.MIN_VAlUE, falls das Maximum unter 0 liegt
        long max = Integer.MIN_VALUE;

        // dazugehöriges x_max mit 0 initialisieren
        int xMax = 0;

        //Schleife welche Werte von 0 bis 100 durchprobiert
        for (int x =0; x<= 100; x++){
            // Wert der für aktuelles x angenommen wird
            long temp = x*x*x- 150*x*x + 5400*x-40000;

            // überprüfen ob Wert > max ist
            if (temp>max){
                // dann max überschreiben mit temp
                max = temp;
                // xMax merken
                xMax =x;
            }
        }

        // Ausgabe xMax
        System.out.println(xMax);
        // Ausgabe f(x) maximal
        System.out.println(max);
    }

    public static void main(String[] args){
        funktionsAuswertung();
    }
}
