package activity5;

import java.util.Scanner;

public class act5q6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double x, y, z, area; 
		System.out.println("Enter the number of sides :  " );
		x= scan.nextDouble();
		System.out.println("Enter the side length :  " );
		y= scan.nextDouble();
		
		System.out.println("+++++++++++++++++" );
		System.out.println("The area of pentagon is :  " + area(y));
		}
    
	public static double area(double a) {
		
		double s=0 ,val=0;
		
		val = Math.pow(5*(5+(2*Math.sqrt(5))), .5)*a*a/4;
		return val;
		
	}


}
//Area = 1/4(sqrt{5* ( 5 + 2(\sqrt{5}))  a^{2}     