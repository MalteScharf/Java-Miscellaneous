package String;


public class Morgenstund {
    boolean check(String input, char begin, String end){
        if (input.charAt(0) == begin && input.endsWith(end)) return true;
        return false;
    }
    public static void main(String[] args){
        Morgenstund morgenstund = new Morgenstund();
        boolean checker = morgenstund.check("Morgenstund",'s',"Mund.");
        String test = new String("unuu"); // Hier die Test-Zeichenkette
// einsetzen
        int position = 3;
        if (test.indexOf(test.charAt(position)) == position) {
            System.out.println("Kein Wunder!");
        } else {
            System.out.println("Ach!");
        }
    }
}
