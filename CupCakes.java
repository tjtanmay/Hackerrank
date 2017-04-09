import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CupCakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        int j=0,sum=0;
        for(int i=n-1;i>=0;i--){
        	sum += (calories[i]*Math.pow(2,j));
        	j++;
        }
        System.out.println(sum);
        // your code goes here
    }
}
