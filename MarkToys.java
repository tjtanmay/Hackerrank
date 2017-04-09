import java.util.Scanner;
import java.util.Arrays;
public class MarkToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k= sc.nextInt();
		int[] price = new int[n];
		for(int i=0;i<n;i++){
			price[i]=sc.nextInt();
		}
		Arrays.sort(price);
		int count=0;
		for(int i=0;i<n;i++){
			if(price[i]<k && k>=1){
				k -= price[i];
				count++;
			}
		}
		if(count==0){
			System.out.println("-1");
		}
		else
			System.out.println(count);
	}

}
