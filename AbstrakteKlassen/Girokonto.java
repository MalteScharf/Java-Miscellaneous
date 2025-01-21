package AbstrakteKlassen;

public class Girokonto extends Konto{

    double dispokredit = 0;
    public void legeDispokreditFest(double dispokredit){
        this.dispokredit = dispokredit;
    }

    void abheben(double betrag){
        if (betrag < this.guthaben){
            this.guthaben -= betrag;
        }
        else {
            double dispo = (betrag - this.guthaben)*(1+dispokredit);
            this.guthaben = -dispo;
        }
    }

}
