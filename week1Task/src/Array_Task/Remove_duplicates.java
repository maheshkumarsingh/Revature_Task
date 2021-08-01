package Array_Task;

import java.util.Arrays;

public class Remove_duplicates {

	public static void main(String[] args) {
		int arr[]= {11,22,44,22,1,5,88,44,88,99,99};
		
		int arr1[]=new int[arr.length];
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k=0;
	    for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]!=arr[i])
				arr1[k++]=arr[i];
		}
	    arr1[k++]=arr[arr.length-1];
	    
	    
	    for (int i = 0; i <k; i++) {
			System.out.print(arr1[i]+" ");
		}

}
}
