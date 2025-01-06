package ControlStructures;

public class Teiler {
    public static void main(String[] args){
        int testzahl = 100;
        for (int i =1; i<=testzahl;i++){
            if (testzahl %i ==0){
                System.out.println(i);
            }
        }
    }
}
