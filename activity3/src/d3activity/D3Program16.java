package d3activity;

import java.util.Scanner;

public class D3Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double sal;
		System.out.println("Enter your basic salary : ");
		sal = scan.nextInt();
		
		if (sal <=10000) {
			System.out.println("Your GROSS salary is :" + (sal*(1+(0.2+0.8))));
		} else if (sal <= 20000) {
			System.out.println("Your GROSS salary is :" + (sal*(1+(0.25+0.9))));
		} else {
			System.out.println("Your GROSS salary is :" + (sal*(1+(0.3+0.95))));
		}
	}

}
