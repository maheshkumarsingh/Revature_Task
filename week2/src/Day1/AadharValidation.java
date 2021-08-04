package Day1;

public class AadharValidation {
	//Runtime--Unchecked

	public boolean isValidAadhar(String aadhar) throws InvalidAadharException{
		if(aadhar!=null && aadhar.matches("[0-9]{12}"))
		{
			return true;
		}
		else
			throw new InvalidAadharException("Invalid "+aadhar+" Number");
	}
	
	public boolean isValidInteger(String str) throws NumberFormatException{
		if(str!=null && str.matches("[0-9]{3}"))
			return true;
		else
			throw new NumberFormatException(str+" is NOT a number");
	}
	
	

}
