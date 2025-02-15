package UE;

public class Polynome {
    public static void main(String[] args){
        int max = Integer.MIN_VALUE;
        int counter =0;
        for(int x =0; x<=100;x++){
            int f = (x*x*x)-(150*x*x)+(4500*x)-40000;
            if(f>max){
                max = f;
                counter = x;
            }
        }
        System.out.println(max);
        System.out.println(counter);
        int y = 18;
        //System.out.println(y^3-150*y^2+4500*y-40000);


    }
}
