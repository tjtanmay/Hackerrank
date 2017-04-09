import java.util.Arrays;
import java.util.Scanner;
public class Grid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for(int i=1;i<=tc;i++){
			int n=in.nextInt();
			char[][] grid=new char[n][n];
			for(int j= 0;j<n;j++){
				String s= in.next();
				for(int k = 0;k<n;k++){
					grid[j][k]=s.charAt(k);
				}
			}
			for(int j=0;j<n;j++){
				Arrays.sort(grid[j]);	
			}
			int flag=0;
			for (int row = 1; row < n; row++) {
	            for (int col = 0; col < n; col++) {
	                if (grid[row][col] < grid[row-1][col]) {
	                    System.out.println("NO");
	                    flag=1;
	                    break;
	                }
	            }
	            if(flag==1)
	            	break;
	            
	        }
			if(flag==0){
				System.out.println("YES");
			}
			
		}

	}

}
