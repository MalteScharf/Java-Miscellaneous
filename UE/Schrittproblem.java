package UE;

public class Schrittproblem {

    public double schrittproblem(int n, double p, int x){
        // Basis fall x = n = 0
        //if (n == 0 && x == 0) return  1;
        if (n == 0 ) return  1;


        // Basisfall |x|>n
        if (Math.abs(x)>n) return 0;

        // Rekursiver Abstieg

        return (p*schrittproblem(n-1,p,x-1)) + ((1-p)*schrittproblem(n-1,p,x+1));
    }

    /* Um Schwierigkeiten durch die Array-Indizierung zu vermeiden gibt
        diese Methode den korrekten Array-Index für die Position x auf
        dem Zahlenstrahl zurück, wenn der Zahlenstrahl von -n bis n geht. */
    private int arrayIndex(int x, int n) {
        return n+x+1;
    }
    public double schrittproblemIte(int n, double p, int x) {
        if(n<0) throw new IllegalArgumentException();
        if(x>n) return 0;
        if(-x>n) return 0;
    /* erster Index des Feldes: Position auf dem Zahlenstrahl
    (arrayIndex() verwenden!)
    zweiter Index des Feldes: Anzahl der Schritte */
        double[][] s = new double[2*(n+1)+2][n+1];

        // iterativ über anzahl der Schritte berechnen (n)
        for (int i=0;i<=n;i++){ // Schritte
            for(int j=-i; j<=i;j++){ // positionen (x)
                if(i==0) s[arrayIndex(j,i)][i] =1;
                s[arrayIndex(j,n)][i] =
                s[arrayIndex(j-i,n)][i-1]*(1-p) +
                        s[arrayIndex(j+1,n)][i-1]*p;

            }
            // wenn Wert schon berechnet, Array auswerten
            if (s[arrayIndex(x,n)][n]!=0) return s[arrayIndex(x,n)][n];
            // sonst  den Wert berechnen:


        }


        return s[arrayIndex(x,n)][n];
    }


    public static void main(String[] args){
        Schrittproblem s = new Schrittproblem();
        double result = s.schrittproblem(10,0.5,0);
        System.out.println(result);
    }
}
