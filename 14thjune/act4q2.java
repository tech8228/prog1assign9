package activity4;

import java.util.Scanner;

public class act4q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	    double length, breadth;
	
		System.out.println("Please Enter the Length: ");
		length = scan.nextDouble();
		System.out.println("Please Enterthe Breadth: ");
		breadth = scan.nextDouble();
		if (length == breadth){
		    System.out.println("This is a Square ");
		}else {
		    System.out.println("This is not a Square ");
		}
	}

}
