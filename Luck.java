import java.io.*;
import java.util.*;

public class Luck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> array=new ArrayList<Integer>();
        int temp, t;
        int luck=0;
        for (int i = 0; i < n; i++){
            temp = sc.nextInt();
            t = sc.nextInt();
            if (t == 1) {
                array.add(temp);
            }
            else luck+=temp;
        }
        Collections.sort(array);
        Collections.reverse(array);
        for (int i = 0; i<array.size();i++){
            if (i<k) luck+=(int)array.get(i);
                else luck-=(int) array.get(i);
        }
        System.out.println(luck);
    }
}