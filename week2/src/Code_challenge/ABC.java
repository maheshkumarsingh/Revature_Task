package Code_challenge;

public class ABC {
	public static void main(String[] args) {
		String S="ABC";
		for(int i=0;i<S.length();i++)
        {

            int c=S.charAt(i);

            

            if(((c-65)+1)<10)

            System.out.print("0"+((c-65)+1));

            if(((c-65)+1)>10)

            System.out.print(((c-65)+1));

            if(((c-65)+1)==10)

            System.out.print(((c-65)+1));

        }
	}


}
