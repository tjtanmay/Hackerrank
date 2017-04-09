import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutStick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int small;
        boolean flag=true;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        small=arr[0];
        
        while(flag){
            int control=0;
            for(int i=0;i<n ;i++){
                 if(arr[i]<small)
                    small=arr[i];
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    arr[i]=arr[i]-small; 
                    count +=1;
                }
                
            }
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    control+=1;
                }
                if(control==n-1){
                    flag=false;
                }
            }
            if(count>0)
                System.out.println(count);
           
           
            
        }
        
        
    }
}
