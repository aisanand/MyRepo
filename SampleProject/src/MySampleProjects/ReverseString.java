package MySampleProjects;

public class ReverseString {
	
	public static void main(String[] args) {
		String s= "ais";
		for(int i=s.length()-1;i>0;i--) {
			System.out.println(s.charAt(i));
		}
		// TODO Auto-generated method stub
		String initial="pia", rev="";
		System.out.println("Enter the string to reverse");
		int length=initial.length();
		for(int i=length-1;i>=0;i--)
		  rev=rev+initial.charAt(i);
		System.out.println("Reversed string: "+rev);
		System.out.println(rev("sandy"));
		
		
	}
	//reccursion
	public static String rev(String s) {
		  if (s.isEmpty())
	            return s;
		  System.out.println(s.charAt(0));
		  System.out.println(s.substring(1));
		  
		return rev(s.substring(1))+s.charAt(0);
		
	}
}
