package Test;


public class Analyse {
    public static void main(String[] args){
        int[] array = new int[] {3,18,2,108,-1};
        int i =0;
        boolean b;
        Analyse a = new Analyse();
        while (i<5){
            try{
                b = a.check(array[i]);
                System.out.println(b);
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            i = i+1;
        }
    }
    public boolean check(int n){
        System.out.println("Checking "+n);
        while (n>10){
            int m = n%10;
            do {
                n/=10;
                m+=n%10;
            } while (n>0);
            n=m;
        }
        if (n<0) throw new IllegalArgumentException("Diese Zahl mag ich nicht.");
        return ((n==9) || (n==0));
    }
}
