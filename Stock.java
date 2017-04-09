
import java.io.*;
import java.util.*;

public class Stock {

    public static long Calculate(int prices[]){
        long result = 0;
        int maxvalue = prices[prices.length-1];
        
        for(int i=prices.length-1;i>0;i--){
            if(maxvalue>prices[i-1]){
                result+= (maxvalue - prices[i-1]);
            }
            else{
                maxvalue = prices[i-1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-->0){
            int N = sc.nextInt();
            int prices[] = new int[N];
            for(int i = 0;i<N;i++){
                prices[i] = sc.nextInt();
            }
            System.out.println(Calculate(prices));
            
        }
    }
}