package ControlStructures;

public class Preis {
    public static void main(String[] args){
        double preis = 10;
        double rabatt =0;
        if(preis>100) {
            rabatt = 0.03;
        }
        preis = rabatt * preis + preis * 0.19;
    }
}
