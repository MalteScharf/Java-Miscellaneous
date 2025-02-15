package UE;

import javax.print.DocFlavor;

public class StringTeilung {

    public static int max(int x, int y){
        if (x>y) return x;
        return y;
    }

    public static int LCSr(String s, String t){

        // m und n definieren
        // Basisfall
        if (s.length() == 0 || t.length() == 0) return 0;

        // falls S[m] = T [m]
        if (s.charAt(s.length()-1) == t.charAt(t.length()-1)){
            return 1+ LCSr(s.substring(0,s.length()-1), t.substring(0,t.length()-1));
        }
         return max(LCSr(s,t.substring(0,t.length()-1)),LCSr(s.substring(0,s.length()-1),t));
    }

    static int[][] LCSmemo(String s, String t){
        int[][] memo = new int[s.length()+1][t.length()+1];
        // alle Eintrge mit -1 initialisieren
        for (int i =0; i<s.length()+1;i++){
            for (int j = 0; j<t.length()+1;j++){
                memo[i][j]=-1;
            }
        }
        return memo;
    }

    public static int LCSp(String s, String t){
        int[][] memo = LCSmemo(s,t);
        return LCS(s,t,memo);
    }

    private static int LCS(String s, String t, int[][] memo){

        // m und n definieren
        // Basisfall
        if (s.length() == 0 || t.length() == 0) {
            memo[s.length()][t.length()] =0;
            return 0;
        }


        // falls S[m] = T [m]
        if (s.charAt(s.length()-1) == t.charAt(t.length()-1)){
            memo[s.length()][t.length()] = 1 + LCS(s.substring(0,s.length()-1), t.substring(0,t.length()-1),memo);
            return memo[s.length()][t.length()];
        }
        memo[s.length()][t.length()] = max(LCS(s,t.substring(0,t.length()-1),memo),LCS(s.substring(0,s.length()-1),t,memo));
        return memo[s.length()][t.length()];
    }

    public static void main(String[] args){
        String s = "SASBCV";
        String t = "LABTCS";
        System.out.println(LCSp(s,t));
    }
}
