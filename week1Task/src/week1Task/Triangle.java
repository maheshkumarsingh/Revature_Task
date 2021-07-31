/*4. Given a right angle triangle with sides a, b and c. As per Pythagoras theorem the hypotenuse side c can be 
calculated as square root of a square plus b square. Write a program to compute the hypotenuse, when a and b are provided.*/


package week1Task;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter side=a: ");
			
			int a=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter side=b: ");
			int b=Integer.parseInt(sc.nextLine());
			
			double c= Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
			System.out.println(c);
			System.out.println("hoo");
		}
	


	}


