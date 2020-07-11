package MySampleProjects;
import java.util.ArrayList;
import java.util.List;

public class CountOfConsecutiveCharacters {
	public static void main(String args[]) {
	String a="ASSAM";
	List<Integer> b=new ArrayList<Integer>();
	for(int i=0;i<a.length();i++) {
		if(a.substring(i+1).contains(a.substring(i,i+1))) {
			b.add(1);
			
		}
		else {
			b.add(0);
		}
		
	}
	
	System.out.println(b);
	}
	

}
