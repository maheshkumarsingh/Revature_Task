/*given an array return true if 1 2 3 
 * appears in the array in the somewhere int the same sequence
 */

package Java_Problems_docx_vinay;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter n");
	    
        
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter 1st Number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd Number:");
		int c=sc.nextInt();
		System.out.println(a+" "+b+" "+c);
		
		boolean bool=false;
		
		for (int i = 2; i < arr.length; i++) {
			
			if(arr[i-2]==a)
			{
				if(arr[i-1]==b)
				{
					if(arr[i]==c)
						bool =true;
				}
			}
		}
		
//		for (int i = 0; i < arr.length-2; i++) {
//			if(arr[i]==a && arr[i+1]==b && arr[i+2]==c)
//				bool=true;
//		}
		
		
		
		
		System.out.println(bool);
		
		
		

	
		

	}

}
