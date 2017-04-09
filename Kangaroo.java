import java.util.Scanner;
public class Kangaroo {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
            String found = "NO";
            while (found != "YES"){
                 x1 += v1;
                 x2 += v2;
                 if((x2> x1 && v2>v1)||(x1> x2 && v1>v2)) {
	        	      break;
	             }
                else if((x2>x1 && v2==v1)||(x1>x2 && v1==v2)){
                    break;
                }
                else if(x1==x2){
                     found="YES";
                 }
                        else
                        continue;
            }
            System.out.println(found);  
 
           in.close();
	    }
}
