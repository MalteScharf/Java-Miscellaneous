package SortingAlgos;

public class StringMatching {
    int bestimmeAnfangdesWorts(char[] feld, String wort){
        if (feld == null) return -1;
        for(int i=0; i<= feld.length-wort.length();i++){
            for(int j=0; j<wort.length();j++){
                if (!(feld[i+j] == wort.charAt(j))) break;
                if (j == wort.length()-1) return i;
            }
        }
        return -1;
    }

    void sortiereAbsteigend(String[] feld){
        for (int i =1; i <feld.length;i++){
            for (int j=i; j >0;j--){
                if(feld[j-1].charAt(0)<feld[j].charAt(0)){
                    String temp = feld[j];
                    feld[j] = feld[j-1];
                    feld[j-1] = temp;
                }
                else break;
            }
        }
    }

    void sortiereAufsteigendBubble(int[] feld) {
// beginne beim zweiten Element und betrachte
// die Liste bis zum Index i - 1 als sortiert
        for (int i = 1; i < feld.length; i++) {
// gehe solange von i nach links
// bis das Element an die richtige
// Stelle gerutscht ist
            for (int j = i; j > 0; j--) {
                if (feld[j - 1] > feld[j]) {
// wenn linkes groesser,
// vertausche die Elemente
                    int temp = feld[j];
                    feld[j] = feld[j - 1];
                    feld[j - 1] = temp;
                } else {
// das Element ist
// an der richtigen Stelle
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        char[] feld = {'a','b','H','a','l','l','o'};
        int[] beispiel1 = {4, 35, 23, 5, 2, 67, 45, 21};

        String[] stringFeld = {"Hallo","Affe","Caesar","Banane","Zoro"};
        String wort = "Hallo";
        StringMatching stringM = new StringMatching();
        //System.out.println(stringM.bestimmeAnfangdesWorts(feld,wort));
        //
        for(int s:beispiel1){
            System.out.print(s +" ");
        }
        stringM.sortiereAufsteigendBubble(beispiel1);
        System.out.println("");
        for(int s:beispiel1){
            System.out.print(s +" ");
        }


    }
}
