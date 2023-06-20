package activity4;

import java.util.Scanner;

public class act4q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        
         int minute, day, year, temp;
         System.out.println("Enter time in minutes: ");
         minute = scan.nextInt();
         year = minute / 525600;
         temp = minute % 525600;
         day = temp / 1440;
        
         System.out.println("There is: "+year+" years and "+ day+ " days"); 
	}

}
