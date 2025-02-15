package Test;

public class B extends A{
    public static int n = 0;
    public B() {
        n++;
    }
    public void f(int x) {
        n = x + n;
    }
}
