package HA_3;

public class A {
    private int a;
    static double b;
    private int staticC;
    public double d;
    private static float c;

    public void g() {
        d *= h(a);
    }

    private static double h(double z) {
        return z * 3 + a;
    }

    void i(double x) {
        b += x * c;
        x *= 2;
    }

    public static void k(A obj) {
        obj.d = 7.0;
    }

    public static void main(String[] args) {
        int f = (int) c;
        i(f);
    }
}