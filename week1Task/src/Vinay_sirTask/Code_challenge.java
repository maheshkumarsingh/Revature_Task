/*A string S1 has been given.

You have to append a character at the beginning of the string (only once), such that the resultant string is a

palindrome.

Return the character that makes the resultant string a palindrome.

Return "2" if no character can be appended at the beginning so that the final string is a palindrome
then retrun Z*/


package Vinay_sirTask;

import java.util.Scanner;

public class Code_challenge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1=sc.nextLine();
		System.out.println(returnChar(s1));
		
		

	}
	
	public static char returnChar(String str)
	{
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(str.length()-1)).append(str);
		if(sb.toString().equals(sb.reverse().toString()))
		{
			//System.out.println(sb);
			return sb.toString().charAt(0);
		}
		else
			return 'Z';
		
	}
	

}
