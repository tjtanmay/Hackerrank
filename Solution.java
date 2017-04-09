import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	int noOfEntry = Integer.parseInt(br.readLine());
        
        
        PhoneBook[] phoneBook = new PhoneBook[noOfEntry];
        
        for(int i=0;i< noOfEntry;i++){
        	
            String name=br.readLine();
            long number=sc.nextLong();
            
            phoneBook[i]=new PhoneBook(name,number);
        }
        String[] chk = new String[noOfEntry];
        for(int i=0;i< noOfEntry;i++){
        	chk[i] = br.readLine();
        	
        }
        for(int i=0;i< noOfEntry;i++){
        	
        	if(phoneBook[i].getName().equals(chk[i])){
        		 System.out.println(phoneBook[i].getName()+"="+phoneBook[i].getNumber());
        	}
        	else{
        		System.out.println("Not found");
        	}
           
            
        }
    }
}
class PhoneBook{
    private String name;
    private long number;
    PhoneBook(String name, long number){
        this.name=name;
        this.number=number;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName() {
		return name;
	}
    public void setNumber(long number){
        this.number=number;
    }
    public long getNumber() {
		return number;
	}
    
}
