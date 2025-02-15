package UE;

public class M {
    public static void main(String[] args) {
        A a = new A(2);
        System.out.println(A.x); // OUT:
        int z = a.f(3);
        System.out.println(z+" "+A.x); // OUT:
        B b = new B(5);
        System.out.println(B.x+" "+b.y); // OUT:
       z = b.f(6);
        System.out.println(z+" "+b.y); // OUT:
        a = b;
        z = a.f(7);
        System.out.println(z); // OUT:
    }
}
