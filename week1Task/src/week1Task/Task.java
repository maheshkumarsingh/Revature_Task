package week1Task;

public class Task {

	public static void main(String[] args) {
		String str="hello hi howwwwww are you howwwwww";
		System.out.println(print(str));

	}
	
	public static String print(String str)
	{
		String s[]=str.split(" ");
		
        //String res=" ";
		int max=0;
	    for (int i = 0; i < s.length; i++) {
			if(max<=s[i].length())
				max=s[i].length();
		}
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			if(max==s[i].length())
				sb.append(s[i]).append(" ");
				
		}
		return sb.toString();
		
		
		
	}
}



