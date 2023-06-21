package d3activity;

import java.util.Scanner;

public class D3Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val1;
		System.out.println("Please input the Number : ");
		val1 = scan.nextInt();
		
		if (val1 % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
