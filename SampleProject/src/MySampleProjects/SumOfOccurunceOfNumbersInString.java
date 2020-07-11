package MySampleProjects;
public class SumOfOccurunceOfNumbersInString {
	
	public static void main(String args[]) {
		String string="ABCD1234RF";
		int sum=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>='0' && string.charAt(i)<='9') {
				sum+=Integer.parseInt(string.substring(i,i+1));
				System.out.println(sum);
			}
			
		}
		System.out.println(sum);
	}

}
