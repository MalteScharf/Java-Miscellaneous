package TypeCasting;

public class Typecasting {
    public static void main(String[] args){
        long betragInCent = 2342352;
        int prozentsatz = 3;
        long jahreszinsInCent = (long) (prozentsatz / 100.0 * betragInCent);
        System.out.println(jahreszinsInCent);
    }
}
