package activity5;

import java.util.Scanner;

public class act5q6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan = new Scanner(System.in);
			
			int x, y, z, area; 
			
			System.out.println("Enter the number to check prime :  " );
			x= scan.nextInt();
			
			if (!state(x))
			      System.out.println(x + " is a prime number.");
			    else
			      System.out.println(x + " is not a prime number.");
			}
	    
		public static boolean state(int a) {
			
			boolean flag = false;
		    for (int i = 2; i <= a / 2; ++i) {
		      // condition for nonprime number
		      if (a % i == 0) {
		        flag = true;
		        break;
		      }
			
			
		}return flag;
		}


}
