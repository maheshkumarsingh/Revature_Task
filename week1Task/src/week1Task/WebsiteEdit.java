/*1. Given a website address as a string, extract the domain name. For example, if the website address is 
 * "https://en.wikipedia.org/wiki/Main_Page", then it should return "en.wikipedia.org" as the domain name.
 * 2. Given a website address as a string, find out if the website is secure or not. A website address starting with 
 * "http" is not secure and a website with "https" is secure.
 */
package week1Task;
public class WebsiteEdit {

	public static void main(String[] args) {
		System.out.println(Returnwebsite("https://en.wikipedia.org/wiki/Main_Page"));
		if(isSecure("\"https://en.wikipedia.org/wiki/Main_Page\""))
		System.out.println("secure");
		else
			System.out.println("Not Secure");
		
	}
	private static boolean isSecure(String string) {
		boolean b=false;
		
		if(string.contains("https"))
			b=true;
		return b ;
	}
	public static String Returnwebsite(String s)
	{
		
		return s.substring(8, 24);
	}

	}


