package String;

public class StringVerschieden {

    String first(String a, String b, String c){
        if(a.compareTo(b)>0) {
            if (b.compareTo(c)>0) return c;
            else {
                return b;
            }
        }

        return a;
    }

    public static void main(String[] args){
        String a = "Das hier ist ganz viel Text.";
        String b = "awerhgarsdasfasnichtopjkfasf";
        System.out.println(a.substring(0,13) + b.substring(5,8) + " "
                + b.substring(15,20).toUpperCase()
                + a.substring(17));
    }
}
