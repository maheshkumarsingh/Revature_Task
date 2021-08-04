package Conversion;

public class Conversion {

	public static void main(String[] args) {
		/*Integer i = 100;
		System.out.println(i.toBinaryString(i));
		
		System.out.println(i.toHexString(i));
		
		System.out.println(i.toOctalString(i));

		// Double d=100.20d;
//		System.out.println(d.toBinaryString(d));
//		System.out.println(i.toHexString(i));
//		System.out.println(i.toOctalString(i));

		System.out.println("--------------------------");

		String str = "1010";
		Integer BinToDec=Integer.parseInt(str, 2);
		System.out.println(BinToDec);
		
		String str1 = "157";
		Integer num = Integer.parseInt(str1, 8);
		System.out.println(num);

		String str2 = "23";
		Integer HextoDec = Integer.parseInt(str2, 16);
		System.out.println(HextoDec);
		
		
		String str3="123.456";
		Double d=Double.parseDouble(str3);
		System.out.println(d);
		*/
		
//		i/p=7865
//		o/p=seven eight six five
		
		String input="7865";
		for (int i = 0; i < input.length(); i++) {
			
			switch(input.charAt(i))
			{
			case '1':
				System.out.print("one " );
				break;
			case '2':
				System.out.print("two ");
				break;
			case '3':
				System.out.print("three ");
				break;
			case '4':
				System.out.print("four ");
				break;
			case '5':
				System.out.print("five ");
				break;
			case '6':
				System.out.print("six ");
				break;
			case '7':
				System.out.print("seven ");
				break;
			case '8':
				System.out.print("eight ");
				break;
			case '9':
				System.out.print("nine ");
				break;
			case '0':
				System.out.print("zero ");
				break;
				default:
					System.out.println("Not a number ");
			}
		}
        
     }

}
