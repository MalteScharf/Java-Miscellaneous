package Objekttypen;

class Rechnung {
    // Attribute
    double betrag;
    double mehrwertsteuer;
    double rabatt;
    Kunde rechnungsempfaenger;
    // Methoden
    void legeRabattFest(final double neuerRabatt) {
        this.rabatt = neuerRabatt;
    }

    void fuegePostenHinzu(int anzahl, double einzelpreis){
        this.betrag += anzahl*einzelpreis;
    }

    void legeMehrwertsteuerFest(double mehrwertsteuer){
        this.mehrwertsteuer = mehrwertsteuer;
    }
}
