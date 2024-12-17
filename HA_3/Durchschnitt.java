package HA_3;

public class Durchschnitt {
        public double berechneDurchschnitt(int[] feld) {
            double durchschnitt = 0;
            int zeahler = 0;

            for (int i = 0; i< feld.length;i++){
                if (feld[i] >0) {
                    durchschnitt += feld[i];
                    zeahler ++;
                }
            }
            durchschnitt = durchschnitt / zeahler;
            if (zeahler==0) return 0;
            return durchschnitt;
        }
}
