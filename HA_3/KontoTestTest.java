package HA_3;

public class KontoTestTest {
    public static void main(String[] args){
        Bank deuba = new Bank("DeuBa",123424);
        Kunde thomas = new Kunde("Thomas");
        Konto konto = new Konto(123123, deuba, thomas);

        System.out.println(konto.liefereInhabername());
    }
}
