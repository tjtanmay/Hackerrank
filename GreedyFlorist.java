import java.util.Scanner;
import java.util.Arrays;
public class GreedyFlorist {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] price = new int[n];
		for(int i=0;i<n;i++){
			price[i]=sc.nextInt();
		}
		Arrays.sort(price);
		
		int total=0,x=0;
		for(int len=price.length-1;len>=0;){
			for(int i=0;i<k && len>=0;i++){
				total += (x+1)*price[len];
				len--;
			}
			x++;
		}
		System.out.println(total);
	}
}
