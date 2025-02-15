package Vorbereitung;

public class Binary {
    static int count1(int n){
        if(n==0) return 0;
        int m = n/2;
        if (2*m!=n) return 1+count1(m);
        return count1(m);
    }
    static int count0(int n){
        if(n==0) return 1;
        if(n==1) return 0;
        int m=n%2;
        return count0(((n-m)/2))+1-m;
    }
    static boolean equivalent(int n, int m){
        return ((count1(n) == count1(m))&&count0(n)==count0(m));
    }
    public static void main(String[] args){
        System.out.println(count1(5));
        System.out.println(count0(6));
        System.out.println(equivalent(2,3));
        System.out.println(equivalent(2,4));
        System.out.println(equivalent(5,6));
        System.out.println(equivalent(9,12));




    }
}
