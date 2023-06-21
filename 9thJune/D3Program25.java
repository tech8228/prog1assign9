package d3activity;

import java.util.Scanner;

public class D3Program25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int A, B, C;
		System.out.println("Please input the First Angle of Triangle : ");
		A = scan.nextInt();
		System.out.println("Please input the Second Angle of Triangle : ");
		B = scan.nextInt();
		System.out.println("Please input the Third Angle of Triangle : ");
		C = scan.nextInt();
		
		if (180 == A+B+C) {
			System.out.println("Triangle is valid");
		} else {
			System.out.println("Triangle is  Not valid");
		}
	}

}
