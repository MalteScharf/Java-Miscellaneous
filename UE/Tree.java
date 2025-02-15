package UE;

public class Tree {
    public static void printTree(int height){
        printCrown(height);
        printStem(height);
    }
    public static void printCrown(int height) {
        for(int i=0;i<height;i++){
            // leere berechnen
            for (int j =0; j<height-i;j++){
                System.out.print(" ");
            }
            int k=0;
            while (k<=i*2){
                System.out.print("#");
                k++;
            }

            System.out.println();
        }

    }
    public static void printStem(int heightCrown) {
        int widthStem = heightCrown/3;
        if (widthStem % 2 == 0) widthStem++;
        int heightStem = heightCrown/3;

        for (int i =0; i<heightStem;i++){
            for(int j =0; j<heightCrown-widthStem+1;j++){
                System.out.print(" ");
            }
            int k=0;
            while (k<widthStem*2-1){
                System.out.print("#");
                k++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        printTree(7);
    }
}

