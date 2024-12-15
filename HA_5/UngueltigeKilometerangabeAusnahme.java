package HA_5;

class UngueltigeKilometerangabeAusnahme extends Exception{
    UngueltigeKilometerangabeAusnahme(int km){
        super("Nur positive Kilometerangabe möglich. Eingabe von "+ km +" nicht möglich.");
    }
}
