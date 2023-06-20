package assign1;

import java.util.Scanner;

public class q2a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year,month, val=0, i;
		String monthName;
		System.out.println("Please input the year  : ");
		year = scan.nextInt();
		System.out.println("Enter month in number to check number of days");
		month = scan.nextInt();
		
		
		if (year > 999) {
		if (year % 4 == 0) {
			System.out.println(year+" year is Leap Year");
			i=1;
			
		} else {
			System.out.println(year+" year is Not a Leap Year");
			i=0;
		}
	
		
		switch (month) {
		case 1:
			monthName = "January";
			val = 31;
			break;
		case 2:
			monthName = "February";
			if (i == 0)
			val= 28;
			else 
			val =29;
			break;
		case 3:
			monthName = "March";
			val= 31;
			break;
		case 4:
			monthName = "April";
			val= 30;
			break;
		case 5:
			monthName = "May";
				val= 31;
			break;
		case 6:
			monthName = "June";
				val= 30;
			break;
		case 7:
			monthName = "July";
				val= 31;
			break;
		case 8:
			monthName = "August";
			val =31;
			break;
		case 9:
			monthName = "September";
			val=30;
			break;
		case 10:
			monthName = "October";
			val=31;
			break;
		case 11:
			monthName = "November";
			val=30;
			break;
		case 12:
			monthName = "December";
			val=31;
			break;
		default: 
			monthName = "wrong Month Number";
			break;
		}				
	    System.out.println(monthName + " "+ year+" had "+ val+" days");
		} else {
			System.out.println("Please input 4 digit year");
		}
	}

}
