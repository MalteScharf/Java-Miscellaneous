package Fields;

public class Quadrat {
    static int size =6;
    public static void main(String[] args){
        double[][] quadrat = new double[size][size];
        for(int i =0; i<size;i++){
            for (int j=0;j<size;j++){
                if (i==j) quadrat[i][j] = 1.0;
                else quadrat[i][j] = 0.0;
            }
        }
        System.out.println(quadrat[0][1]);
    }
}
