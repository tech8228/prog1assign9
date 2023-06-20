package d3activity;

import java.util.Scanner;

public class D3Program31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double A, B, C;
		System.out.println("Please input First number : ");
		A = scan.nextDouble();
		System.out.println("Please input Second number : ");
		B = scan.nextDouble();
		System.out.println("Please input Third number : ");
		C = scan.nextDouble();
		
		if (A == B && B== C) {
			System.out.println("All numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
	}

}
