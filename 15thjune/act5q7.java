package activity5;

import java.util.Scanner;

public class act5q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
		double x, y, z, area; 
		System.out.println("Enter First Number :  " );
		x= scan.nextDouble();
		System.out.println("Enter Second Number :  " );
		y= scan.nextDouble();
		System.out.println("Enter Third Number :  " );
		z= scan.nextDouble();
		System.out.println("+++++++++++++++++" );
		System.out.println("Check if Three numbers are consecutive or not :  " + state(x,y,z));
		}
    
	public static boolean state(double a, double b, double c) {
		
		boolean flag;
		double max, min, mid;
		max = Math.max(a,  Math.max(b, c));
		min = Math.min(a,  Math.min(b, c));
		mid = a+b+c-max-min;
		if (max-mid == 1 && mid-min == 1) {
			flag= true;
		}else {
			flag = false;
		}
		return flag;
		
	}


}
