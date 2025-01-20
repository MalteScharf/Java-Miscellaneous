package Rekursion;

public class Binaersucher {
    public boolean istEnthalten(String s,String[] feld){
        return istEnthalten(s,feld,0,s.length()-1);
    }

    private boolean istEnthalten(String s, String[] feld, int start, int ende){
        // Basisfall
        if (start == ende || start == ende -1) {
            return feld[start] == s || feld[ende] == s ;
        }
        int mitte = start +(ende - start)/2;
        if (feld[mitte].compareTo(s) == 0) return true;
        if (feld[mitte].compareTo(s) < 0) return istEnthalten(s,feld,mitte-mitte/2,mitte);
        return istEnthalten(s,feld,mitte+mitte/2,mitte);
    }

    public static void main(String[] args){
        String[] 
    }

}
