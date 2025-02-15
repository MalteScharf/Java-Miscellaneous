package Test;

public class M {
    public static void main(String[] args) {
        A a = new A();
        a.f(5);
        System.out.println(a.z+", "+B.n); // OUT:
        B b = new B();
        b.f(5);
        System.out.println(b.z+", "+B.n); // OUT:
        a = b;
        b.z = a.z + 1;
        a.f(5);
        System.out.println(a.z+", "+B.n); // OUT:
        a.z = b.z + 1;
        b.f(5);
        System.out.println(b.z+", "+B.n); // OUT:
    }
}
