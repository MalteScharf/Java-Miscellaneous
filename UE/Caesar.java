package UE;

public class Caesar {
    public static String encrypt(String text) {
        char[] c = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char s :c){
            sb.append((char) (s - 'A' + 13 + 26) % 26 + 'A');
        }

        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(encrypt("Uryyb"));
    }
}
