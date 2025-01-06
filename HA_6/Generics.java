package HA_6;

public class Generics {

    public static void main(String[] args){
        java.util.Map<String,Integer> m = new java.util.HashMap<String,Integer>();
        String s = "Hallo";
        int x = 10;
        m.put(s,x);
        m.put(s + s, x + x);
        m.put(s, m.get(s+s));
        int y = m.get(s);
        x = m.size();
        System.out.println(x);
        System.out.println(y);
    }

}
