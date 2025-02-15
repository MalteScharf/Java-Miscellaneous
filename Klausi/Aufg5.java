package Klausi;

public class Aufg5 {
    private static int max(int x, int y){
        if (x > y) return x;
        return y;
    }
    private static int min(int x, int y){
        if (x > y) return y;
        return x;
    }
    public static int coingame(int[] coins){
        // Memofeld speichert die jeweiligen Maximus die es gibt, für bestimmte start und endindex kombinationen
        // Memofeld mit Länge endIndex initialisieren
        int[][] memo = new int[coins.length][coins.length];

        // Memofeld mit -1 initialisieren
        for (int i=0; i<coins.length;i++){
            for (int j=0; j<coins.length; j++){
                memo[i][j] =-1;
            }
        }

        return coingame(coins, 0, coins.length - 1, memo);
    }
    private static int coingame(int[] coins, int startIndex, int endIndex, int[][] memo){

        // Basisfälle
        if (startIndex > endIndex) return 0;

        if (startIndex == endIndex) return coins[startIndex];

        // Wenn Einträge für startIndex und endIndex schon gespeichert wurden, werden diese aus memo ausgelesen
        // EIntrage ist dann in memo nicht -1
        if (memo[startIndex][endIndex] != -1){
            return memo[startIndex][endIndex];
        }

        // Ansonsten gebe den Eintrag des memo Felds zurück bzw. berechne den Eintrag des Feldes rekursiv
        return memo[startIndex][endIndex] = max(min(coingame(coins, startIndex + 2, endIndex,memo), coingame(coins, startIndex + 1, endIndex - 1,memo)) + coins[startIndex], min(coingame(coins, startIndex + 1, endIndex - 1,memo), coingame(coins, startIndex, endIndex - 2,memo)) + coins[endIndex]);
    }

    public static void main(String[] args){
        // Testdata
        int[] coins = new int[] { 203, 523, 971, 392, 269, 660, 745, 667, 996, 120, 883, 264, 949, 851, 441, 416, 106, 743, 49, 765, 805, 288, 871, 186, 600, 564, 597, 421, 939, 498, 459, 542, 962, 806, 275, 511, 433, 457, 270, 504, 733, 408, 116, 570, 927, 59, 300, 524, 444, 200, 636, 203, 248, 238, 352, 914, 651, 786, 790, 704, 64, 324, 726, 498, 660, 341, 300, 143, 576, 929, 981, 647, 473, 544, 32, 398, 173, 302, 258, 542, 264, 73, 975, 740, 861, 256, 295, 725, 455, 359, 859, 646, 666, 565, 441, 410, 680, 616, 909, 586 };
        //int[] coins = new int[] {2,4,1,3,9,2};
        System.out.println(coingame(coins));
    }
}
