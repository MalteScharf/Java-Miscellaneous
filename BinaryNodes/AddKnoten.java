package BinaryNodes;

class AddKnoten extends BinaerOperatorKnoten{

    // ruft den Konstruktor der Superklasse BinaerOperatorKnoten auf und
    // übergibt die zwei Parameter aus dem Konstruktor
    public AddKnoten(Knoten erster, Knoten zweiter){
        super(erster, zweiter);
    }

    /**
     *
     * @return gibt die Summe des linken und rechten Teilbaum zurück
     */
    @Override
    public int werteAus() {
        return this.liefereErstenOperand().werteAus()+ this.liefereZweitenOperand().werteAus();
    }

    /**
     *
     * @return gibt die Ausdrücke des ersten und zweiten Knoten in Klammern,
     * getrennt durch das "+" Zweichen als String zurück
     */
    @Override
    public String toString() {
        return "(" + erster.toString()+" + "+zweiter.toString()+")";
    }
}
