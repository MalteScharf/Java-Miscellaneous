package Vorbereitung;

public class Verschluesseln {
    static String gaius(String s, boolean enc){
        String result ="";
        char l ='a';
        for (int i =0;i<s.length();++i){
            if(s.charAt(i)>=l && s.charAt(i)<=l+25){
                result += e(s.charAt(i), enc?5:-5);
            }
        }
        return result;
    }
    static char e(char x, int y){
        x+=y;
        if (y>0 && x>'z') x -='z' -'a'+1;
        if (y<0 && x <'a') x+='z'-'a'+1;
        return x;
    }
    public static void main(String[] args){
        System.out.println(5%2);
        System.out.println(gaius("ofaf",true));
        System.out.println(gaius("Kurs20022",true));

    }
}
