package DynamicProgramming;

public class StringTeilung {
    public int stringTeilungRek(int[] z, int n){

        // Basisfall
        if (z.length == 1) return n;
        if (z.length == 0) return 0;

        int optimum = n;
        for (int i =0; i<z.length;i++){

            int[] z_left = new int[i];
            for(int k = 0; k<i;k++){
                z_left[k] = z[k];
            }

            int[] z_right = new int[z.length-i];
            for(int k = i+1; k<z.length;k++){
                z_right[k-i-1] = z[k]-z[i];
            }

            int aktuellerWert = n+ stringTeilungRek(z_left,z[i]) + stringTeilungRek(z_right,n-z[i]);
            if (aktuellerWert<optimum) optimum = aktuellerWert;

        }
        return optimum;
    }

    public int stringTeilungMemo(int[] z, int n){
        int[] r = new int[n];
        return stringTeilungMemo(z,n,r);
    }

    private int stringTeilungMemo(int[] z, int n, int[] r){
        // Basisfall
        if (z.length == 1) return n;
        if (z.length == 0) return 0;

        if (r[n] >0) return r[n];
    }

}
