import java.util.*;
public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1= sc.next();
		String str2 = sc.next();
		int length = str1.length()+str2.length();
		boolean flag=false;
		System.out.println(length);
		int val =str1.compareTo(str2);
        if(val<=0){
            System.out.println("No");
        }
        else if(val>0){
        	System.out.println("Yes");
        }
	
       String str= str1.substring(0, 1).toUpperCase() + str1.substring(1);
       String strr= str2.substring(0, 1).toUpperCase() + str2.substring(1);
			
			System.out.print(str+" "+strr);
			
	}

}
