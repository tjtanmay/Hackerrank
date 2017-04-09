import java.util.*;
public class JimOrd {
	public static void main(String[] arg){
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int[] arr=new int[n];
		int[] sortedArray = new int[n];
		int[][] td=new int[n][2];
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
				td[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			sortedArray[i]=arr[i]=td[i][0]+td[i][1];
		}
		Arrays.sort(sortedArray);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==sortedArray[j]){
					System.out.println(j+1);
					break;
				}
			}
		}
	}
}
