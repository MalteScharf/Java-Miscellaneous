package UE;

public class Chiffre {
    public static String chif(String s){
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if (c<'a'){
                c = (char) (c+26);
            }
            char k = (char) ((char) c-3);
            sb.append(k);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(chif("olhehnxuvwhloqhkphughvnxuvhvhlqixhkuxqjlqglhremhnwrulhqwlhuwhsurjudpplhuxqjixhuzluwvfkdi" +
                "wvlqirupvdwlnhuuhfkwkhucolfkhqjoxhfnzxqvfkcxuhuirojuhlfkhqhqwvfkoxhvvhoxqjghvfkliiuhvlfkkriih" +
                "vlhkdwwhqnhlqhvfkzlhuljnhlwhqglhvhdxijdehcxehduehlwhqxqgzxhqvfkhlkqhqqrfkylhohuirojehlghuz" +
                "hlwhuhqehduehlwxqjghudxijdehqglhvhunodxvxu"));
    }
}
