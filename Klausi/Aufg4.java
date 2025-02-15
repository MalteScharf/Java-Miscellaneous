package Klausi;

public class Aufg4 {

    public static int anzahlTeiler(int[] input){
        // Idee: Brute Force alle Zahlen bis inkl. der Zahl x durchgehen und überprüfen ob Rest 0 ist

        // globales Maximum mit 0 initialisiren
        int max = 0;

        // iterieren durch das array
        for(int i =0; i<input.length; i++){
            // lokales Max initialisieren
            int lokMax =0;

            // wenn Rest der Teilung durch einen Wert = 0, dann ist dieser Wert ein ganzzahliger Teiler
            for(int t =1; t<=input[i];t++){
                if (input[i] % t == 0) lokMax++;
            }

            // Überprüfen ob lok max größer als globales Max. Falls ja: neues globales Max ist der Wert von lokMax

            if (lokMax>max) max =lokMax;
        }

        return max;

    }

    public static void main(String[] args){
        //int[] input = new int[]{2,4,10,24,33,15,100,7,12,44};
        int[] input = new int[]{36,951,356,311,564,8,885,369,60,309,603,19,62,624,591,965,644,685,333,369,635,174,951,440,408,831,461,395,244,344,374,255,559,691,964,295,125,281,985,54,472,865,393,101,301,694,300,102,348,629,199,620,266,756,458,861,1,915,901,731,545,490,126,715,933,349,459,369,658,296,841,363,698,280,896,768,780,851,140,712,531,359,48,613,146,753,987,801,234,104,295,208,378,255,507,980,740,676,166,950};


        System.out.println(anzahlTeiler(input));
    }

}
