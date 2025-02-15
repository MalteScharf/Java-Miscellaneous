package Test;

public class Stuff {
    public static void main(String[] args){
        int x = 10;
        while (x > 1) {
            System.out.println(x);
            System.out.println("Hallo!");
            x -= x / 2;
        }
    }
}
