package UE;

import java.util.Arrays;

public class Muenzwechsel {


     int coinExchange(int[] coins, int amount){

        // Basisfall: wenn amount 0 ist
         if (amount == 0) return 0;

         int minCoins = Integer.MAX_VALUE;
         for (int coin:coins){
             if ((amount - coin) >=0){
                 int temp = coinExchange(coins,amount-coin);
                    if (temp !=-1) {
                        minCoins =  Math.min(coin,temp+1);
                    }
             }
         }

       return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    int coinExchangeDP(int[] coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1); // Fülle das Array mit einem großen Wert

        // Basisfall: wenn amount 0 ist
        dp[0] = 0;

        for (int coin:coins){
            for(int i = coin; i<=amount;i++){
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }

        return dp[amount] <= amount ? dp[amount] : -1;
    }

    public static void main(String[] args){
         Muenzwechsel m = new Muenzwechsel();
         int[] coins = {1,2,4};
         System.out.println(m.coinExchangeDP(coins,8));
    }
}
