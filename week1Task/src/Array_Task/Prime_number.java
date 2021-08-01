package Array_Task;

public class Prime_number {
	public static void main(String[] args) {  
	       int arr[]= {1,2,3,4,5,6,7,8,9};
	       for (int i = 0; i < arr.length; i++) {
			
		
	       if (isPrime(arr[i]))  
	           System.out.print(arr[i]+" ");  
	       
	       }
	   }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i*i <=n; i++)
	    	   //for (int i = 2; i<Math.sqrt(n); i++)
	       
	       {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true; 
	       
	   }  
	}
			
			
	


