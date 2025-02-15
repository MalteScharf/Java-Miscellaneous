package Klausi;

class C{
    B r;
    public int x;
    public void f(int x){
        r.g();
    }
    public static void main(String[] args){
        C c = new C();
        B b = new B();
        c.r = b;
        c.r.f();
        }
}
