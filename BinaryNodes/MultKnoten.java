package BinaryNodes;

class MultKnoten extends BinaerOperatorKnoten{
    // ruft den Konstruktor der Superklasse BinaerOperatorKnoten auf und
    // übergibt die zwei Parameter aus dem Konstruktor
    public MultKnoten(Knoten erster, Knoten zweiter){
        super(erster, zweiter);
    }

    /**
     *
     * @return gibt die Multiplikation des linken und rechten Teilbaum zurück
     */
    @Override
    public int werteAus() {
        return this.liefereErstenOperand().werteAus() * this.liefereZweitenOperand().werteAus();
    }

    /**
     *
     * @return gibt die Ausdrücke des ersten und zweiten Knoten in Klammern,
     * getrennt durch das "*" Zeichen als String zurück
     */
    @Override
    public String toString() {
        return "(" + erster.toString()+" * "+zweiter.toString()+")";
    }
}
