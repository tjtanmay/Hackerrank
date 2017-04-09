import java.util.Scanner;
public class Record {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int i=0; i < n; i++){
            score[i] = in.nextInt();
        }
        int max =score[0];
        int min =score[0];
        int minCount=0;
        int maxCount=0;
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if(score[i]<min){
        			min=score[i];
        			minCount+=1;
        		}
        		if(score[i]>max){
        			max=score[i];
        			maxCount+=1;
        		}
        		
        	}
        }
        System.out.println(maxCount +" "+minCount);
	}
}
