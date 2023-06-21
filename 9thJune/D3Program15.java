package d3activity;

import java.util.Scanner;

public class D3Program15 {

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
		
		if (total >= 90) { 
			System.out.println("Grade is A");
		} else if (total >= 80 ) {
			System.out.println("Grade is B");
		} else if (total >= 70) {
			System.out.println("Grade is C");
		} else if (total >= 60) {
			System.out.println("Grade is D");
		} else if (total >= 40) {
			System.out.println("Grade is E");
		} else {
			System.out.println("Grade is F");
		}
		
	}

}
