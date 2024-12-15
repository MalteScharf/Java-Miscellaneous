package Exceptions;

public class GefaehrlicheKlasse {
    public static void main(String[] args){
        GefaehrlicheKlasse gk = new GefaehrlicheKlasse();
        //gk.b(7);
    }
    public static void a(int x) throws Exception {
        b(x);
    }
    public static void b(int x) throws Exception {
        if (x < 10) {
            d(x, x);
        } else {
            try {
                c(-x);
            } catch (RuntimeException e) {
                throw new IllegalArgumentException();
            }
        }
    }
    private static void c(int i) throws Exception {
        try {
            e(2 * i, i - i);
        } catch (Exception e) {
            throw new Exception("Fehler!");
        }
    }
    private static int e(int i, int j) {
        return i / j;
    }
    private static void d(int x, int i) {
        int[] f = new int[i];
        for (int k = 0; k <= x; k++) {
            f[k] = i;
        }
    }
}
