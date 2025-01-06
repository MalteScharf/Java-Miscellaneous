package ControlStructures;

public class Rechteck {
    public static void main(String[] args){
        int hoehe = 4;
        int breite = 5;
        int counterHoehe =0;
        int counterBreite =0;


        while (counterHoehe<hoehe){
            while (counterBreite<breite){
                System.out.print("*");
                counterBreite++;
            }
            System.out.println();
            counterHoehe++;
            counterBreite =0;
        }
    }

}
