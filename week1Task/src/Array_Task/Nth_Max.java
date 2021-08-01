//1)Find Nth  max in array, remember it will have duplicates


package Array_Task;
import java.util.Arrays;

public class Nth_Max {

	public static void main(String[] args) {
		int arr[]= {11,22,44,22,1,5,88,99};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Maximum  ="+ arr[arr.length-1]);
	}

}
