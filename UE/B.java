package UE;

public class B extends A{
    public int y = 2;
    public B(int y) {
        super(y+2);
        System.out.println("Konstruktor B int y = " + y);
    }
    public int f(int x) {
        y += x;
        return y;
    }
}
