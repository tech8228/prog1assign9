package activity4;

import java.util.Scanner;

public class act4q11h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, i,j,space= 0;
         System.out.println("Enter Number of row to get pattern : ");
         val = scan.nextInt();
		space = val - 1;  
		for (j = 1; j<= val; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= val - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (val - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
	}

}
