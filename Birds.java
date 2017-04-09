import java.util.Scanner;


public class Birds {
	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] types = new int[n];
	        int maxFreqValue=0,freqId=0;
	        for(int types_i=0; types_i < n; types_i++){
	            int index = in.nextInt(); 
	            types[index-1]++;
	        }
	        
	        for(int i=0; i < n; i++){
	            if(types[i]>maxFreqValue){
	                maxFreqValue=types[i];
	                freqId=i+1;
	            }
	        }
	        System.out.println(freqId);
	    }
	}