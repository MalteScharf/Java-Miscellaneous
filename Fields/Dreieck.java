package Fields;

public class Dreieck {
    static int[][] dreieck = new int[8][];
    public static void main(String[] args){
        int counter =0;
        for(int i=0; i< dreieck.length;i++){
            dreieck[i] = new int[i+1];
            for(int j=0;j<=i;j++){
                dreieck[i][j] = j + counter;
            }
            counter++;
        }
        System.out.println(dreieck[7][7]);
    }
}
