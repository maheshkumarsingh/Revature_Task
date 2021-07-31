//3. Mass of earth is 5.972 x 10 power 24. Represent this value in a variable and print the same.

package week1Task;
import java.lang.Math;
//import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MassofEarth {

	public static void main(String[] args) {
		
//double mass= 5.972;
//int a=10;
//int b=24;
//		System.out.println(mass*Math.pow(a,b));
//	
//double mass=5.97200000000000000000000000000000d;
//System.out.println(mass);
	
	
	double m=5.972*Math.pow(10, 24);
	
	String pattern= "";
	
	
	DecimalFormat dc= new DecimalFormat(pattern);
	
	System.out.println(dc.format(m));
}

	}