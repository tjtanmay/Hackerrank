import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int mod=k%n;
        int[] a = new int[n];
        
        for(int a_i=mod; a_i < n; a_i++){
            if(a_i<n)
                a[a_i] = in.nextInt();
            if(a_i==n-1){
                for(int j=0;j<mod;j++){
                    a[j]=in.nextInt();
                }
            }
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
        	System.out.println(a[m]);
        }
    }
}
