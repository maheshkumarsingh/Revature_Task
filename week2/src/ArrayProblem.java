import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {
		int B[]= {20,-1,70,-1,168};
		int X=2;
		int N=B.length;
		System.out.println(getMissingValuesOfMagicArray(N,X,B));
	}

	public static String getMissingValuesOfMagicArray(int N, int X, int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]==-1))
			{
				arr[i]=((X+i+1)*(X+i+2)*(X+i+3)) / 3;
//				System.out.println(arr[i]);
			}
			}
		return Arrays.toString(arr);
//		System.out.println("jiii");
	}
	

}
