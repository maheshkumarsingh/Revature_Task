
/* 5)Take array as input remove the digits where the first value and last value is same
 * eg [101,22,344,699]-> in this 101 and 22 should be removed because the first digit and last is same
 * so output will be [344,699]
 * */


package Array_Task;

import java.util.Arrays;

public class Remove {
	public static void main(String[] args) {
		
	int arr[]= {101,22,555,344,699};
	System.out.println(Arrays.toString(arr));
	for (int i = 0; i < arr.length; i++) {
		
	
     int firstDigit=firstDigit(arr[i]);
     int lastDigit=lastDigit(arr[i]);
     
     if(firstDigit==lastDigit)
    	 System.out.print(arr[i] +" ");
	}

	}
	public static int firstDigit(int n)
	{
		while(n>=10)
			n/=10;
		return n;
	}
	public static int lastDigit(int n)
	{
		return n%10;
	}
}
