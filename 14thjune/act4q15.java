package activity4;

import java.util.Scanner;

public class act4q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			
		 	char alpha1, check;
			int len;
			String beta;
			System.out.println(" Input an Grade: ");
			beta = scan.next().toLowerCase();
			len = beta.length();
			
			alpha1 = beta.charAt(0);
			
			
			
			if (len > 1  ) {
				System.out.println("Please input single character alphabet ");
			} else {
			if (Character.isDigit(alpha1)) {
				System.out.println("Please input single character alphabet we ");
			}else {
			
			
			switch(alpha1){
				case 'e':
				System.out.println("Excellent");
	              break;
				case 'v':
	        	  System.out.println("Very Good");
	              break;
				case 'g':
					System.out.println("Good");
		            break;
				case 'a':
		        	System.out.println("Average");
		            break;
				case 'f':
		        	System.out.println("Fail");
		            break;		  
				default:
	              break;
				}
			}
			}
			
			
	}

}
