import java.util.*;
public class Freq {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] user = new int[n];
		int[] freq = new int[n];
		for(int i=0;i<n;i++){
			freq[i]=-1;
			user[i]=sc.nextInt();
		}
		int count;
		for(int i=0;i<n;i++){
			count=1;
			for(int j=i+1;j<n;j++){
				if(user[i]==user[j]){
					count++;
					user[j]=0;
				}
			}
			if(user[i]!=0){
				freq[i]=count;
			}
		}
		for(int i=0;i<n;i++){
			if(freq[i]!=0 && freq[i]!=-1)
				System.out.println(freq[i]+" " + user[i]);
		}
			
		
	}
}
