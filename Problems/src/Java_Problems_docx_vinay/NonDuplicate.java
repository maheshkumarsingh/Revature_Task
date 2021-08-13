package Java_Problems_docx_vinay;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicate {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[5];
		
		int res=arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if((res^arr[i])>0)
				arr1[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));

	}

}
