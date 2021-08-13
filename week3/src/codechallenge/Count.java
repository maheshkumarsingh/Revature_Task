package codechallenge;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(count(str, n));

	}

	public static int count(String str, int n) {
		// String res = "";

//		char ch[]=str.toCharArray();
		int sum = 1;
		int sum1 = 0;
		int a = 1;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				sum=1;
				if (str.charAt(i) == str.charAt(j))
					a = (str.charAt(i)) - 96;
				sum *= a;

			}
			sum1+=sum;

		}
		return sum1;

	}
}
