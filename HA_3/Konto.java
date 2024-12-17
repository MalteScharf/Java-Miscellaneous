package HA_3;

public class Konto {
    Bank bank;
    Kunde inhaber;
    long kontostand;
    long nummer;

    public Konto(long kontoNr, Bank b, Kunde k){
        this.nummer = kontoNr;
        this.bank = b;
        this.inhaber = k;
        this.kontostand = 0;
    }

    void auszahlen(long cent){
        kontostand = kontostand - cent;
    }

    void einzahlen(long cent){
        kontostand = kontostand + cent;
    }

    String liefereBankname() {
        return this.bank.liefereName();
    }

    long liefereBLZ() {
        return this.bank.liefereBLZ();
    }

    String liefereInhabername(){
        return this.inhaber.liefereName();
    }

    long liefereKontonummer(){
        return this.nummer;
    }

    long liefereKontostand(){
        return this.kontostand;
    }
}
