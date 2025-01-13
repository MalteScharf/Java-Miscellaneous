package Fields;

public class Minmax {
    public static void main(String[] args){
        Minmax minmax = new Minmax();
        double[] filed = {1.0,2.0,3.0};
        System.out.println(minmax.returnMax(filed));
    }

    double returnMax(double[] field){
        double max = 0.0;
        for (double i:field){
            if (i>max) max = i;
        }
        return max;
    }
}
