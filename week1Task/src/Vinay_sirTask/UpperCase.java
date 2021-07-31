//Task1 - Convert every word's last letter to upper case

package Vinay_sirTask;

public class UpperCase {

	public static void main(String[] args) {
		String s="hello hi good noon hope we got thread safety";
		System.out.println(convertToTitleCase(s));

	}
	
	public static String convertToTitleCase(String str)
	{
		
		String arr[] =str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].substring(0,(arr[i].length()-1))).append(Character.toUpperCase(arr[i].charAt(arr[i].length()-1))).append(" ");
		}
		
	return sb.toString().trim();
	}

	}


