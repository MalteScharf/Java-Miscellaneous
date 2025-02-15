package UE;

public class A {
    public static int x = 1;
    public A(int x) {
        A.x += x;
        System.out.println("A.x = " + A.x);

    }
    public int f(int x) {
        x++;
        return x;
    }
}
