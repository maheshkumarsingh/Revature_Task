
public class CodeChallenge {

	public static void main(String[] args) {
		
		String Str="Hii hello howwww are you doing";
		System.out.println(printLargest(Str));

	}
	
	public static String printLargest(String str) {
		
		String s[]=str.split(" ");
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


