import java.util.*;
public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char[] str = in.next().toCharArray();
		ArrayList <Character> al = new ArrayList<Character>();
		for(int i=0;i<str.length;i++){
			al.add(str[i]);
		}
		ListIterator<Character> it = al.listIterator();
		while(it.hasNext()){
			char c1 = it.next();
			if(it.hasNext()){
				char c2=it.next();
				if(c1==c2){
					it.remove();
					it.previous();
					it.remove();
					if(it.hasPrevious()){
						it.previous();
					}
					
				}
				else
					it.previous();
				
			}
		}
		if(al.size()>0){
		    for(int i=0; i<al.size();i++){
		    System.out.print(al.get(i));
		    }
		    }else{
		        System.out.print("Empty String");
		    }
	}

}
