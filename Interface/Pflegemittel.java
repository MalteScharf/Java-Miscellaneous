package Interface;

public class Pflegemittel implements BegrenztHaltbar{
    Datum haltbarBis = null;
    public Datum liefereHaltbarkeitsdatum(){
        return haltbarBis;
    }
}
