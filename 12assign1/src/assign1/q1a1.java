package assign1;

import java.util.Random;
import java.util.Scanner;

public class q1a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String monthName;
	    
		System.out.println("We generate a Random Number and give month accordingly");
		Random rand = new Random();
		int max = 12;
		int min = 1;
	
		int randnum = rand.nextInt(max -min)+min;
		System.out.println("random number is : "+ randnum);
			
		switch (randnum) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default: 
			monthName = "wrong Month Number";
			break;
		}				
	    System.out.println("Month for "+ randnum+" number is :"+ monthName);
		
	}

}
