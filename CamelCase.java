import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int counter=1;
		for(int i=0;i<str.length;i++){
			if(Character.isUpperCase(str[i])){
				counter++;
			}
		}
		System.out.println(counter);

	}

}
