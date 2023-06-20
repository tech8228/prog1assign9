package d3activity;

import java.util.Scanner;

public class D3Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Double val1;
		System.out.println("Please input the Number : ");
		val1 = scan.nextDouble();
		
		if (val1 < 0) {
			System.out.println(val1 + " is Negative number.");
		} else {
			System.out.println(val1 + " is Positive number.");
		}
		
	}

}
