package Day1;

import java.util.Scanner;

public class Presenter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Aadhar Number To validate:");
		String str=sc.nextLine();
		AadharValidation a=new AadharValidation();
		try{
			if(a.isValidAadhar(str))
				System.out.println("Aadhar Validated");
		}catch(InvalidAadharException e) {
			System.out.println(e.getMessage());
		}
		
		 
		      try{
		    	  if(a.isValidInteger("abc"))
		    		  System.out.println("Valid Number");
			
		      }catch(NumberFormatException e){
			  System.out.println(e.getMessage());
		       }
		   }
		
			
	}


