import java.util.*;
public class JimOrd1 {
public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
     int n = in.nextInt();

     TreeMap<Integer, TreeSet<Integer>> totalTime = new TreeMap<Integer, TreeSet<Integer>>();

     for(int i=0; i < n; i++){
       int timeDi=in.nextInt()+in.nextInt();

       if(totalTime.containsKey(timeDi)) {
           totalTime.get(timeDi).add(i+1);
       }else{
           TreeSet<Integer> orderNo = new TreeSet<Integer>();
            orderNo.add(i+1);
            totalTime.put(timeDi,orderNo);
       }  
     }
     // System.out.println( totalTime.values());
     for (TreeSet<Integer> orderNos: totalTime.values()) {
        for(Integer order : orderNos)
            System.out.print(order+" ");
     }

}
}