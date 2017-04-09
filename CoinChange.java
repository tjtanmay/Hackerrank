



import java.io.*;
import java.util.*;

public class CoinChange {
    
    private static long findWays(int[] coins,int money){
        int noOfCoins = coins.length;

        // Cell dpCoinWithSums[i][j] represents how many ways we can get sum "j" out of i set of coins.
        long[][] dpCoinWithSums = new long[noOfCoins][money+1];
        
        // Since we can make "zero" money out of any number coins and the only way is taking empty coins. So marking first column with 1.
        for(int row=0; row<noOfCoins; row++) 
        	dpCoinWithSums[row][0] = 1;
        
        // Now Lets populate first row, Note : We are ignoring 0th column because we already populated that earlier.
        for(int column=1; column<money+1; column++) {
            int assessingSum = column;
            int assessingCoin = coins[0];
            if(assessingSum%assessingCoin == 0)
                dpCoinWithSums[0][column] = 1;
            else
                dpCoinWithSums[0][column] = 0;
        }        //Alright now lets fill the matrix, Note : we are now ignoring 0th column & rows.

        
        for(int row=1; row<noOfCoins; row++) {
            for(int column=1; column<money+1; column++) {
                int assessingSum = column;
                int assessingCoin = coins[row];
                long ways = 0;
                // Since this coin is higher than assessing sum, we can clearly can't pick this coin so just simply get the value for previous coin
                if(assessingSum<assessingCoin) { 
                    ways = dpCoinWithSums[row-1][column];
                }else {
                    //Alright so,the sum>= assessingCoin. Have two options, 1) Pick the coin 2) Don't pick the coin
                    
                    //Say, I pick the coin
                    int remainingSum = assessingSum - assessingCoin;
                    // I must have already computed the possible ways for this remiaingSum in previous iterations
                    ways = dpCoinWithSums[row][remainingSum];
                    
                    //Say, i don't pick the coin, then the sum remains same
                    ways+= dpCoinWithSums[row-1][assessingSum];
                }
                dpCoinWithSums[row][column] = ways;
            }
        }
        return dpCoinWithSums[noOfCoins-1][money];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int noOfCoins = in.nextInt();
        int[] coins = new int[noOfCoins];
        for(int i=0;i<noOfCoins;i++) 
        	coins[i] = in.nextInt();
        System.out.println(findWays(coins,money));
        in.close();
    }
}