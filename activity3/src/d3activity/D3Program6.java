package d3activity;

import java.util.Scanner;

public class D3Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int year;
		System.out.println("Please input the year as (YYYY) to check leap year : ");
		year = scan.nextInt();
		
		
		if (year > 999) {
		if (year % 4 == 0) {
			System.out.println(year+" year is Leap Year");
		} else {
			System.out.println(year+" year is Not a Leap Year");
		}
		} else {
			System.out.println("Please input 4 digit year");
		}
	}

}
