/*Task3 - In every word if it is not palindrome then reverse it and print back the whole sentence*/


package Vinay_sirTask;
public class ReturnReverse {

	public static void main(String[] args) {
	    String str= "madam madam 50000 madame 101 1001 50000555";
		convertPalindrome(str);
	}
	
	public static void convertPalindrome(String str)
	{
		String arr[]=str.split(" ");
		
		
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb=new StringBuilder();
			
			if(sb.append(arr[i]).reverse().toString().equals(arr[i]))
			{
				//System.out.println("yes");
				System.out.print(sb.append(" "));
			
			}
			else
				System.out.print(sb.append(" "));
		}
       
	}
	

}
