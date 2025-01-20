package Rekursion;

public class Fakulteat {
    public int fakultaetIterativ(int n){
        if (n <= 0) throw new IllegalArgumentException();
        int result = n;
        for (int i=n-1; i>0;i--){
            if(i==1) return result;
            result *=i;
        }
        return result;
    }

    public int fakultaetRekursiv(int n){
        // Basisfall
        if (n==1) return 1;
        return fakultaetRekursiv(n-1)*n;

    }

    double power(int p, int n){
        // Basisfall:
        if (n==0) return 1;
        return power(p,n-1) *p;
    }

    public int fibo(int n){
        if (n<0){
            throw new IllegalArgumentException();
        }
        // Basisfall
        if (n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }

    public long fibIterativ(int n){
        if (n == 0 || n == 1) return n;
        int a =0;
        int b =1;
        for(int i =2;i<n;i++){
            int temp = a+b;
            a=b;
            b = temp;

        }
        return b;
    }

    long zufallszahl(int n){
        // Basisfall
        if (n<3) return n+1;
        return 1+(((zufallszahl(n-1)-zufallszahl(n-2))*zufallszahl(n-3)) % 100);
    }


    void gebeZufallszahlenAus(){
        for(int i =5;i<=30;i++){
            System.out.println(zufallszahl(i));
        }
    }

    boolean istPalindromIterativ(String s){
        for(int i =0; i<s.length()/2;i++) {
            if (s.charAt(i) != s.charAt(s.length() - i-1)) return false;
        }
        return true;
    }

    boolean istPalindromRekursiv(String s){
        // Basisfall
        if(s.length() == 0 || s.length() ==1) return true;
        String newString = s.substring(1,s.length()-2);
        if (newString.lastIndexOf(newString) != newString.charAt(0)) return false;
        return istPalindromRekursiv(newString);

    }


    public  static void main(String[] args){
        Fakulteat faku = new Fakulteat();
        int result = faku.fakultaetIterativ(1);
        int resultReku = faku.fakultaetRekursiv(1);
        double resultPower = faku.power(3,3);
        int fibo = faku.fibo(5);
        long fiboIter = faku.fibIterativ(5);
        long zufallszahl = faku.zufallszahl(4);
        boolean palin = faku.istPalindromIterativ("TRESERT");
        boolean palinReku = faku.istPalindromIterativ("asasd");
        System.out.println(palinReku);
        //faku.gebeZufallszahlenAus();
    }
}
