package d3activity;

import java.util.Scanner;

public class D3Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Double val1;
		System.out.println("Please input the Number : ");
		val1 = scan.nextDouble();
		
		if (val1 % 5 == 0) {
			if (val1 % 11 == 0) {
				System.out.println("Number is divible by 5 and 11");
				
			} else {
				System.out.println("Number is only divisible by 5");
			}
		} else {
			if (val1 % 11 == 0) {
				System.out.println("Number is only divible by 11");
				
			} else {
				System.out.println("Number is NOT divisible by 5 and 11");
		}
		}
	}
}
