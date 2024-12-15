package HA_5;

public class Rekursion {
    public static void main(String[] args){
        Rekursion test = new Rekursion();
        int result = test.a(6,3);
        System.out.println(result);
    }
    int a(int x, int y) {
        if (x <= 0 || y < 0) {
            System.out.println(x - y + 2);

            return x - y + 2;
        }
        if (x % 2 == 0) {
            return a(x / 2, y) + a(x, y - 1);
        }
        return a(x - 1, y - 2);
    }
}
