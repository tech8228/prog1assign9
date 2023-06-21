package d3activity;

import java.util.Scanner;

public class D3Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double sal;
		System.out.println("Enter your basic salary : ");
		sal = scan.nextInt();
		
		if (sal < 1500) {
			System.out.println("Your GROSS salary is :" + (sal*(1+(0.1+0.9))));
		} else {
			System.out.println("Your GROSS salary is :" + (sal*(1+0.98)+500));
		}
	}

}
