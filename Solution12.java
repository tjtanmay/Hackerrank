import java.io.*;
import java.util.*;

public class Solution12 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] flowers = new int[n];
        for(int i=0;i<n;i++){
            flowers[i]=s.nextInt();
        }
       // System.out.println(CalculateMinPrice(flowers,k));
    
    
   
        //sort all flower prices in ascending order
        Arrays.sort(flowers);
        int i = flowers.length-1;
        int bought = 0;
        int total=0;
        //start backwards from the most expensive flower, stop when there is no more flowers left
        while(i>=0){
            //Calculate total 
            //increment bought by 1 when everyone in the group has bought equal number of flowers
            for(int j=0;j<k && i>=0;j++){
                total+=(1+bought)*flowers[i];
                i--;
            }
            bought++;
        }
      System.out.println(total);
    }
}