//3)Find all the palindrome numbers in array
package Array_Task;

import java.util.Arrays;

public class Palindrome_Number {

	public static void main(String[] args) {
		int arr[]= {111,11,55,583};
		System.out.println(Arrays.toString(arr));
		//String str=Arrays.toString(arr);
		for (int i = 0; i < arr.length; i++)
		{
			StringBuilder sb=new StringBuilder();
            if(sb.append(arr[i]).toString().equals(sb.reverse().toString()))
            	//if(sb.append(arr[i]).reverse().toString().equals(sb.toString()))
            	System.out.print(arr[i]+" ");
		}
		
	}
}


//public class Palindrome_Number{
//	public static void main(String[] args) {
//		int arr[]= {111,11,55,583};
//		//System.out.println(Arrays.toString(arr));
//		
//		
//		int rem=0;
//		for (int i = 0; i < arr.length; i++) {
//			int number=arr[i];
//			int reverse=0;
//			while(number>0)
//			{
//				rem=number%10;
//				reverse=reverse*10+rem;
//				number/=10;
//			}
//			if(reverse==arr[i])
//				System.out.print(arr[i]+" ");
//		}
//	}
//}
		



