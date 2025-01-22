package BinaryNodes;

class IntKnoten implements Knoten{
    int wert;

    /**
     * Konstruktor für Knoten
     * @param wert
     * Ein int Wert wird übergeben, welcher als Wert für die Objektvariable "wert" zugewiesen wird
     */
    public IntKnoten(int wert){
        this.wert = wert;
    }

    // Es wird die
    @Override
    public int werteAus() {
        return this.wert;
    }

    public String toString(){
        return String.valueOf(wert);
    }
}
