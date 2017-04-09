import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PageCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfPage = in.nextInt();
        int pageNo = in.nextInt();
        

        int pageCount=0;
        if(pageNo < noOfPage/2){

        	pageCount=pageNo/2;
        }
        if(pageNo > noOfPage/2){

            pageCount=(noOfPage-pageNo)/2;
        }
        if(pageNo==noOfPage/2){
        	pageCount=pageNo/2;
       
        }
        	
        System.out.println(pageCount);
        
        
    }
}
