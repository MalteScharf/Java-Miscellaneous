package UE;

public class Autoproduktion {

    public int minProd(int[] left, int[] right, int w){
        int step = left.length-1;
        return Math.min(minProd(step,"right",left,right,w),minProd(step,"left",left,right,w));
    }

    private int minProd(int step,String leftRight, int[] left, int[] right, int w){
        // Basisfall wenn step == 0 gebe jeweils Wert zurück
        if(step==0){
            if (leftRight.equals("right")) return right[0];
            if (leftRight.equals("left")) return left[0];
        }

        // wenn sich aktuell auf rechter Straße befindet:
        if (leftRight.equals("right")){
            return Math.min(minProd(step-1,"right",left,right,w)+right[step],minProd(step-1,"left",left,right,w)+left[step]+w);
        }
        // wenn sich aktuell auf der linken Seite befindet:
        return Math.min(minProd(step-1,"right",left,right,w)+right[step]+w,minProd(step-1,"left",left,right,w)+left[step]);

    }

    public int minProdDP(int[] left, int[] right, int w){
        // Memo feld initialisieren für links uns rechts
        int[] memoR = new int[right.length];
        int[] memoL = new int[right.length];
        for (int i =0; i< memoL.length; i++){
            memoR[i] = memoL[i] =-1;
        }
        return Math.min(minProdDP(right.length-1,"right",left,right,w,memoR,memoL),minProdDP(left.length-1,"left",left,right,w,memoR,memoL));


    }

    private int minProdDP(int step,String leftRight, int[] left, int[] right, int w,  int[] memoR, int[] memoL){
        // Basisfall wenn step == 0 gebe jeweils Wert zurück
        if(step==0){
            if (leftRight.equals("right")) return memoR[0] = right[0];
            if (leftRight.equals("left")) return memoL[0] = left[0];
        }
        // wenn sich aktuell auf rechter Straße befindet:
        if (leftRight.equals("right")){
            if (memoR[step] != -1) return memoR[step];
            return memoR[step] = Math.min(minProdDP(step-1,"right",left,right,w,memoR,memoL)+right[step],minProdDP(step-1,"left",left,right,w,memoR,memoL)+right[step]+w);
        }
        if (memoL[step] != -1) return memoL[step];
        // wenn sich aktuell auf der linken Seite befindet:
        return memoL[step] = Math.min(minProdDP(step-1,"right",left,right,w,memoR,memoL)+left[step]+w,minProdDP(step-1,"left",left,right,w,memoL,memoR)+left[step]);

    }

    public static void main(String[] args){
        int[] left = {4,3,7,6};
        int[] right = {2,5,8,3};
        int w = 2;
        Autoproduktion a = new Autoproduktion();
        int result = a.minProd(left,right,w);
        System.out.println(result);
        int resultDP = a.minProdDP(left,right,w);
        System.out.println(resultDP);


    }
}
