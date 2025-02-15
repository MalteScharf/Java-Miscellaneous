package Klausi;

public class Aufg1 {

    /***
     *
     * @param x Eingabe der x- Koordinaten der Kreise
     * @param y Eingabe der y- Koordinaten der Kreise
     * @param r Eingabe des Radius der Kreise
     *
     *          Berechnet, welche Kreise sich Schneiden
     */
    public static void berechneUeberschneidung(double[] x, double[] y, double[] r){
        // Zwei Kreise schneiden sich wenn der Abstand minus den jeweiligen radien zwischen ihnen kleiner oder gleich Null ist

        // initialisierung von s[i][j]: Beide Dimensionen mit Anzahl der Kreise, also Länge der übergebenen Felder (z.B. für x).
        // Annahme: es werden nur korrekte Felder übergeben mit gleichen Längen
        int[][] s = new int[x.length][x.length];

        // Berechnung
        for(int i = 0;i<x.length;i++){
            for (int j =0; j<y.length; j++){
                // Abstand a nach Satz des Pythagoras berechnen: a = sqrt((x_j-x_i)^2+(y_j-y_i)^2))
                //
                double a = Math.sqrt(Math.pow(x[j]-x[i],2) + Math.pow(y[j]-y[i],2));
                // Bedingung für Schneiden: Abstand - radius_1 - radisu_2 <=0
                if (a-r[i]-r[j]<=0) {
                    // Wenn berühren dann 1 in Array schreiben
                    s[i][j] = 1;
                } else {
                    // wenn nicht berühren dann 0 in Array
                    s[i][j] = 0;
                }
            }
        }
        // Ausgabe:
        for(int i=0; i<x.length; ++i)for(int j=0;j<x.length;++j) System.out.print(s[i][j]+((i<x.length-1 || j < x.length-1)?",":""));
    }

    public static void main(String[] args){
        // Testdaten:
        /*double[] x = new double[]{1,17,2,42};
        double[] y = new double[]{1,17,2,42};
        double[] r = new double[]{1,17,2,42};*/


        // echte Daten:
        double[] x = new double[]{ 2,1,15,29,9,12,1,8,18,11 };
        double[] y = new double[]{ 2,5,23,12,63,84,63,63,68,97 };
        double[] r = new double[]{ 18,1,14,11,4,3,16,20,14,9 };




        berechneUeberschneidung(x,y,r);

    }
}
