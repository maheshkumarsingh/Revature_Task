package Conversion;

import java.util.Arrays;
import java.util.Scanner;

public class Removezeros {

	public static void main(String[] args) {
		
		String str="00025";
		//str.replace("0", "");
		System.out.println(str);
		StringBuilder sb=new StringBuilder();
		sb.append(str).replace(0, 3, "");
		System.out.println(sb);
		
		
		//
		
		int arr[]= {1,3,4,3,5,3,2,6,5,2,1,5,7,8,9,8};
		Arrays.sort(arr);
		int mark[]=new int[100];
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j])
					mark[arr[i]]=count++;
			}
		}
		
		for (int i = 0; i < mark.length; i++) {
			System.out.println(i+" "+mark[i]);
		}
		

	}

}
