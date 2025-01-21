package BinaryNodes;

abstract class BinaerOperatorKnoten implements Knoten {
    /* Objekter dieser Klasse verfügen über zwei Variablen mit
    Referenzen auf Objekte des Typs "Knoten"*/
    Knoten erster;
    Knoten zweiter;

    public BinaerOperatorKnoten(Knoten erster, Knoten zweiter){
        if (erster == null || zweiter == null) throw new IllegalArgumentException();
        this.erster = erster;
        this.zweiter = zweiter;
    }
    // liefert das Attribut "erster", also den ersten Knoten zurück
    public Knoten liefereErstenOperand() {
        return erster;
    }

    // liefert das Attribut "zweiter", also den zweiten Knoten zurück
    public Knoten liefereZweitenOperand() {
        return zweiter;
    }
}
