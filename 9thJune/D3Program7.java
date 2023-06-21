package d3activity;

import java.util.Scanner;

public class D3Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int weekNum;
		String weekName;
		System.out.println("Please input week day number: ");
		weekNum = scan.nextInt();
		
		switch (weekNum) {
		case 1:
			weekName = "Monday";
			break;
		case 2:
			weekName = "Tuesday";
			break;
		case 3:
			weekName = "Wednesday";
			break;
		case 4:
			weekName = "Thursday";
			break;
		case 5:
			weekName = "Friday";
			break;
		case 6:
			weekName = "Saturday";
			break;
		case 7:
			weekName = "Sunday";
			break;
		default: 
			weekName = "wrong Number";
			break;
		}
		
		System.out.println("You enterd " + weekName);

	}

}
