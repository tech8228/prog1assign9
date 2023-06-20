package activity5;

import java.util.Scanner;

public class act5q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double x, y, z, area; 
		System.out.println("Enter First side of triangle :  " );
		x= scan.nextDouble();
		System.out.println("Enter Second side of triangle  " );
		y= scan.nextDouble();
		System.out.println("Enter Third side of triangle :  " );
		z= scan.nextDouble();
		System.out.println("+++++++++++++++++" );
		System.out.printf("Area of triangle :  %.2f" , area(x,y,z));
		}
    
	public static double area(double a, double b, double c) {
		
		double s=0 ,val=0;
		s = a+b+c/2;
		val = Math.pow(s*(s-a)*(s-b)*(s-c), .5);
		return val;
		
	}


}
