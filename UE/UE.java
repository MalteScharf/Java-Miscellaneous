package UE;

public class UE {
    public static int subStringCount(String s, String sub){
        int index = s.indexOf(sub);
        int counter =0;
        while (index != -1){
            counter++;
            index = s.indexOf(sub, index+1);
        }

        return counter;
    }
    public static String decrypt(String cypher, String keyword){
        // Key als Liste mit verschiebungseinträge:
        int[] verschiebung = new int[keyword.length()];
        for(int i =0; i<keyword.length();i++){
            // Groß kleinschreibung ist nicht relevant
            verschiebung[i] = Character.toUpperCase(keyword.charAt(i)) - 'A'+1;
        }

        // Enschlüsseln
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<cypher.length();i++){
            char cypherChar = cypher.charAt(i);
            int verschiebe = verschiebung[i % (verschiebung.length-1)];
            char k = (char) ((cypherChar - 'a' - verschiebe +26) %26 + 'a');
            sb.append(k);
           /* if (cypherChar - verschiebe<65){
                char k = (char) (cypherChar - (char) verschiebe + (char) 26);
                sb.append(k);
            } else {
                char k = (char) ((char) cypherChar - (char) verschiebe);
                sb.append(k);
            } */

        }
        return sb.toString();
    }

    public static String encrypt(String cypher, String keyword){
        // Key als Liste mit verschiebungseinträge:
        int[] verschiebung = new int[keyword.length()];
        for(int i =0; i<keyword.length();i++){
            // Groß kleinschreibung ist nicht relevant
            verschiebung[i] = Character.toUpperCase(keyword.charAt(i)) - 'A'+1;
        }

        // Verschlüsseln
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<cypher.length();i++){
            char cypherChar = cypher.charAt(i);
            int verschiebe = verschiebung[i % (verschiebung.length-1)];
            char k = (char) ((cypherChar - 'a' + verschiebe +26) %26 + 'a');
            sb.append(k);

        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "aasdasdasssdasdasdass";
        String sub = "das";
        System.out.println(19%26);

        System.out.println(encrypt("diqdd","key"));
        System.out.println(decrypt(encrypt("digdd","key"),"key"));


    }
}
