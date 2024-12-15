package Exceptions;

public class Exceptions {
    double mehrwertsteuer;
    void legeMehrwertsteuerFest(double neueMwSt) {
        if (neueMwSt<0){
            throw new IllegalArgumentException("Mehrwertsteuer darf nicht negativ sein");
        }
        this.mehrwertsteuer = neueMwSt;

    }
}
