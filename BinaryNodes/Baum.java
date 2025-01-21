package BinaryNodes;

public class Baum implements Knoten{
    Knoten wurzel;

    ///  Baum wird erstellt mit Paramter des Wurzelknotens
    public Baum(Knoten wurzel){
        this.wurzel = wurzel;
    }

    @Override
    public int werteAus() {
        return wurzel.werteAus();
    }

    public String toString(){
        return wurzel.toString();
    }

    public Knoten liefereWurzel(){
        return this.wurzel;
    }

    public static Baum erzeugeBeispielBaum(int a, int b, int c, int d, int e){
        IntKnoten A = new IntKnoten(a);
        IntKnoten B = new IntKnoten(b);
        IntKnoten C = new IntKnoten(c);
        IntKnoten D = new IntKnoten(d);
        IntKnoten E = new IntKnoten(e);
        Knoten beispielWurzel = new AddKnoten(new MultKnoten(A,B),new DivKnoten(C,new SubKnoten(D,E)));
        return new Baum(beispielWurzel);
    }
}
