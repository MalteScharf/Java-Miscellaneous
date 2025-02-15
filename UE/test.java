package UE;

public class test {
    public static boolean intcheck(int x){
        if (x<=1) return false;
        for (int i=2; i<=x/2;i++){
            if (x/i*i==x )return  false;
        }
            return true;
    }

    public double berechneWurzel(double a, int n){
        if (n==0) return a;
        return (berechneWurzel(a,n-1)+a/berechneWurzel(a,n-1))/2;
    }
    public int[] berechneDreieckszahlen(int n){
        if (n<0) return null;
        int[] d = new int[n];
        for (int i =0; i<n;i++){
            if(i==0) d[i] =0;
            else d[i] = i + d[i-1];
            }

        return d;
        }
    public static boolean checkBuchstabe(char buchstabe1,char buchstabe2){
        // Check ob identisch buch1 == buch2 oder Großklein ('a' - 'A')
        if (buchstabe1 == buchstabe2 || (buchstabe1- buchstabe2) == ('a'-'A') ||(buchstabe1- buchstabe2) == ('A'-'a') ) return true;
        return false;
    }

    public static void main(String[] args){
        test t = new test();
        //System.out.println(t.berechneDreieckszahlen(4)[0]);
        char c1 = 'A';
        char c2 = 'A';
        System.out.println(checkBuchstabe(c1,c2));
        System.out.println(checkBuchstabe(c2,c1));

    }

}
