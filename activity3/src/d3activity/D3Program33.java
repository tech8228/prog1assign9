package d3activity;

import java.util.Scanner;

public class D3Program33 {

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
		
		if (A > B && B> C) {
			System.out.println("Numbers are in decreasing order");
		} else if (C>B && B>A){
			System.out.println("Numbers are in increasing order");
		}else {
			System.out.println("Numbers are in random order");
		}
	}

}
