package OOPs;

public class Area {
private double height;
private double width;
private double side;
private double parallelA;
private double parallelB;


public Area(double height, double width) {
	
	this.height = height;
	this.width = width;
	
	System.out.println(height*width);
}


public Area(double side) {
	
	this.side = side;
	System.out.println(side*side);
}


public Area(double height, double parallelA, double parallelB) {
	
	this.height = height;
	this.parallelA = parallelA;
	this.parallelB = parallelB;
	System.out.println(height*(parallelA+parallelB)/2);
}


public static void main(String[] args) {
	Area ar(10,20);
	Area ar1(10.0);
}







}
