package MySampleProjects;
import java.util.Scanner;

public class ZZOOOO {

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
//		int a[]=new int[2];
		int m=1,n=1;
		s=s.toLowerCase();
		boolean zflag=false,oflag=false;
		for(int i=0;i<s.length();i++) {


			if(s.charAt(i)=='z'&&!zflag) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						m++;
						zflag=true;
					}
					
				}
			}
			if(s.charAt(i)=='o'&&!oflag) {
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						n++;
						oflag=true;
					}
					
				}
			}
		}
		scanner.close();
		if(n/m==2 && n%m==0){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}
