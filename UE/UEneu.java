package UE;

public class UEneu {
    static String letter(int i){
        if(i<10) return Integer.toString(i);
        return Character.toString((char)('A'+(i-10)));
    }

    static String enc(int i, int base){
        if (base>36 || base<2) throw new IllegalArgumentException();
        if(i==0) return "0";
        String result ="";
        while (i>0) {
            result=letter(i%base) + result;
            i/=base;
        }
        return result;
    }
    static int value(char i){
        if(i>='0' && i<='9') return i-'0';
        return i-'A'+10;
    }

    static int dec(String s, int base){
        if (base>36 || base<2) throw new IllegalArgumentException();
        int result =0;
        for (int i=0;i<s.length();++i){
            result*=base;
            result+=value(s.charAt(i));
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(letter(20));
        System.out.println(enc(10,3));
        //System.out.println(dec(enc(8,2),2));
    }


}
