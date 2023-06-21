package d3activity;

import java.util.Scanner;

public class D3Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double phy, che, bio, math, comp, total;
		System.out.println("Enter Physics Marks : ");
		phy = scan.nextDouble();
		System.out.println("Enter Chemistry Marks : ");
		che = scan.nextDouble();
		System.out.println("Enter Biology Marks : ");
		bio = scan.nextDouble();
		System.out.println("Enter Mathematics Marks : ");
		math = scan.nextDouble();
		System.out.println("Enter Computer Marks : ");
		comp = scan.nextDouble();
		
		total = (phy+che+bio+math+comp)/5;
		
		if (total >= 60) { 
			System.out.println("You have First Division");
		} else if (total >= 50 ) {
			System.out.println("You have Second Division");
		} else if (total >= 40) {
			System.out.println("You have Third Division");
		} else {
			System.out.println("FAIL");
		}
	}

}
