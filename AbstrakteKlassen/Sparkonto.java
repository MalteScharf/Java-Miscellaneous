package AbstrakteKlassen;

public class Sparkonto extends Konto{

    @Override
    public void abheben(double betrag) {
        if (betrag > this.guthaben){
            System.out.println("Sie können maximal" + betrag + "abheben.");
        }
        else{
            this.guthaben -= betrag;
        }

    }
}
