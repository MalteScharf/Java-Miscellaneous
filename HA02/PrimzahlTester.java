package HA02;

public class PrimzahlTester {
    public void istPrimzahl(long n) {
        if (n == 0) {
            System.out.println("NEIN");
            return;
        }
        if (n == 1) {
            System.out.println("NEIN");
            return;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("NEIN");
                return;
            }
        }
        System.out.println("JA");
    }


}
