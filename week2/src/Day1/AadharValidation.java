package Day1;

public class AadharValidation {
	
	//Runtime--Unchecked
	String str="hii";

	public boolean isValidAadhar(String aadhar) throws InvalidAadharException{
		if(aadhar!=null && aadhar.matches("[0-9]{12}"))
		{
			return true;
		}
		else
			throw new InvalidAadharException("Invalid "+aadhar+" Number");
	}
	
	//Checked Exception
	
	public boolean isValidInteger(String str) throws NumberFormatException,ArithmeticException{
		if(str!=null && str.matches("[0-9]{3}"))
			return true;
		else
			throw new NumberFormatException(str+" is NOT a number");
	}
	
	

}
