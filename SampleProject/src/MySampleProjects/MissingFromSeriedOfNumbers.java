package MySampleProjects;

public class MissingFromSeriedOfNumbers {

	static int getMissingNo(int a[], int n) 
    { 
        int i, total; 
        total = (n + 1) * (n + 2) / 2; 
//        System.out.println(total);
        for (i = 0; i < n; i++) 
            total -= a[i]; 
        return total; 
    } 
	
	static int getMissingN(int a[], int n)  
    { 
        int total = 1; 
        for (int i = 2; i <= (n + 1); i++) 
        { 
//        	System.out.println("total bef0 "+total);
            total += i; 
//            System.out.println("total afftr "+total);
            total -= a[i - 2]; 
        } 
//        System.out.println(total);
        return total; 
    } 
	
	static int getMissing(int a[], int n) 
	{ 
	    int i; 
	    int x1 = a[0]; /* For xor of all the elements in array */
	    int x2 = 1; /* For xor of all the elements from 1 to n+1 */
	  
	    for (i = 1; i < n; i++) {
	        x1 = x1 ^ a[i]; 
	    System.out.println("x1 "+x1);}
	  
	    for (i = 2; i <= n + 1; i++) {
	        x2 = x2 ^ i; 
	    System.out.println("x2 "+x2);}
	    return (x1 ^ x2); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = { 1, 2,3,4, 6 }; 
	        int miss = getMissingNo(a, a.length); 	        
	        System.out.println(miss); 
	        System.out.println(getMissingN(a, a.length));
	        System.out.println(getMissing(a, a.length));

	}
}
       
 