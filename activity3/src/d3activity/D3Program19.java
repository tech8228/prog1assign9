package d3activity;

import java.util.Scanner;

public class D3Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int jyear, cyear=2023, temp;
		System.out.println("Enter the year you joined in (YYYY) format : ");
		jyear = scan.nextInt();
		
	
		if (jyear > 999) {
			if (jyear < cyear) {
				temp= cyear-jyear;
				if (temp >=3) {
					System.out.println("You get bonus of CAD 2500");
				} else {
					System.out.println("There is NO bonus");
				}
			} else {
				System.out.println("You entered wrong year. Please check");
			}
		} else {
			System.out.println("Please input 4 digit year");
		}
	}

}
