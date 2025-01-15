package SortingAlgos;

public class Sorting {
    int bestimmteAnzahl(int wert, int[] feld){
        int counter =0;
        for (int i: feld){
            if (i == wert) counter++;
        }
        return counter;
    }

    boolean istEnthalten(String wert, String[] feld){
        for(String s:feld){
            if (s.equals(wert)) return true;
            break;
        }
        return false;

    }

    public static void main(String[] args){
        int[] feld = {1,3,2,1,1,1};
        String[] stringFeld = {"Test", "hallo"};
        Sorting sort = new Sorting();
        int anzahl = sort.bestimmteAnzahl(1,feld);
        System.out.println(anzahl);
        System.out.println(sort.istEnthalten("s",stringFeld));

    }
}
