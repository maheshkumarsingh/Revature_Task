/*Task2 - If the word is of odd length then convert middle letter to uppercase else convert first letter to uppercase*/


package Vinay_sirTask;
public class UppercaseIfOdd {

	public static void main(String[] args) {
		
		String str= "hello hi good noon hope we got thread safety";
		System.out.println(convertTitle(str));
	}
	
	public static String convertTitle(String str)
	{
		String arr[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()%2==0)
				sb.append(arr[i].substring(0,(arr[i].length()-1))).append(Character.toUpperCase(arr[i].charAt(arr[i].length()-1))).append(" ");
			
			else
				sb.append(arr[i].substring(0,(arr[i].length()/2))).append(Character.toUpperCase(arr[i].charAt((arr[i].length()/2)))).append(arr[i].substring((arr[i].length()/2+1),arr[i].length())).append(" ");
				
		}
		return sb.toString();
	}
	}


