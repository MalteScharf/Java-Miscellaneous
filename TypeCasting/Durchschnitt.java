package TypeCasting;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Durchschnitt {
    public static void main(String[] args){
        long a = 1;
        long b =5;
        long c = 12312;
        double durchschnitt = (double) (a+b+c)/3;
        System.out.println(durchschnitt);
    }
}
