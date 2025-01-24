package ImplementationTest;

import java.util.ArrayList;

public class TrueFalse {

    public static void main(String[] args){
        boolean u = false;
        boolean v = false;
        boolean w = false;
        boolean x = false;
        boolean y = false;
        boolean z = false;


        int counter = 0;
        for(int j =0; j<2;j++) {

            for (int i = 0; i < 2; i++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int p = 0; p < 2; p++) {
                            for (int q = 0; q < 2; q++) {
                                if (q == 0) z = false;
                                else z = true;
                                if (p == 0) y = false;
                                else y = true;
                                if (l == 0) x = false;
                                else x = true;
                                if (k == 0) w = false;
                                else w = true;
                                if (i == 0) v = false;
                                else v = true;
                                if (j == 0) u = false;
                                else u = true;
                                boolean term = !(u && v || w && !x || y && z && !u  || z && v && !y  ||  (x && (y || !(x && z && w) && !(y  ||  z)))&&!(!z && !y  || y&& x && !z));

                                if (term == true) {
                                    System.out.println(term);
                                    counter++;
                                }
                            }
                        }
                    }
                }

            }
        }

        System.out.println(counter);
    }




}
