import java.util.Scanner;
public class MinimumCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tC = sc.nextInt();
		int[] price = new int[tC] ;
		
		for(int i=0;i<tC;i++){
			int black=sc.nextInt();
			int white=sc.nextInt();
			int priceB=sc.nextInt();
			int priceW=sc.nextInt();
			int priceC=sc.nextInt();
			if(black==white && priceB==priceW){
				//int pricee=black*priceB;
				//System.out.println(pricee*2);
			    price[i]= (black*priceB)*2;
				//System.out.println(price[i]*2);
			}
			if(black<white && priceB<priceW ){
//				int pricee=black*priceB + white*priceW;
//				System.out.println(pricee);
				price[i] = black*priceB + white*priceW;
			}
			if(black<= white && priceB> priceW){
				price[i] = black*(priceW+priceC) +white*priceW;
				//System.out.println(pricee);
			}
			if(black>= white && priceW> priceB){
				 price[i] = white*(priceB+priceC) +black*priceB;
				//System.out.println(pricee);
			}
		}
		for(int i=0;i<tC;i++){
			System.out.println(price[i]);
		}

	}

}
