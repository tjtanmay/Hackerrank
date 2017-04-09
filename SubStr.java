import java.util.*;
public class SubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int subLen=sc.nextInt();
		int len = str.length();
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i=0;i<len-subLen+1;i++){
			
			
			ts.add(str.substring(i,i+subLen));
		}
		
		
		String stcompL=(String)ts.first();
		
		String stcompM=(String)ts.last();
		
		
		System.out.println(stcompL);
		System.out.println(stcompM);
		
	
	}

}
