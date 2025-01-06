package ControlStructures;

public class Clock {
    public static void main(String[] args){
        int start = 800;
        int ende = 1645;
        int differenz = ende - start;
        int stunde  =differenz/100;
        int minute = differenz - stunde*100;
        if (differenz<0){
            stunde = 24 + stunde -1;
            minute = 60 + minute;
        }
        System.out.println(stunde + " Stunden");
        System.out.println(minute + " Minuten");


    }
}
