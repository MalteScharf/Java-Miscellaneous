package HA_5;

public class MeinMietpreisBerechner {
    public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
        long mietPreis = 0;
        if (tage<=0) throw new UngueltigeTagesanzahlAusnahme(tage);
        if (km<0) throw new UngueltigeKilometerangabeAusnahme(km);

        if (tage<14){           // Auto wurde weniger als 14 Tage gemietet
            mietPreis += 2000 * tage; // 20 Euro Pro Tag
            mietPreis += 4000;        // 40 Euro Pauschale bis einschließlich 200km
            if (km> 200) mietPreis += (km-200) * 15; // wurde das Auto mehr als 200km gefahren, kommen nochmal 12 cent pro zusätzlichen km dazu)
        }
        else {                            // wird das Auto mehr als 14 Tage gemietet
            mietPreis += 30000 + 12 * km; // 300 Euro Pauschle + 12 cent pro KM
        }
        return mietPreis;
    }

}
