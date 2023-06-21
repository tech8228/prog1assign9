package activity4;

import java.util.Scanner;

public class act4q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			
			double grade;
			System.out.println("Please Enter your Grade: ");
			grade = scan.nextDouble();
			
			if (grade > 80) { 
				System.out.println("Grade is A");
			} else if (grade > 60 ) {
				System.out.println("Grade is B");
			} else if (grade > 50) {
				System.out.println("Grade is C");
			} else if (grade > 45) {
				System.out.println("Grade is D");
			} else if (grade >= 25) {
				System.out.println("Grade is E");
			} else {
				System.out.println("Grade is F");
			}
	}

}
