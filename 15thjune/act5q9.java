package activity5;

import java.util.Scanner;

public class act5q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int x, y, z, area; 
		System.out.println("Enter the Number :  " );
		x= scan.nextInt();
		x= Math.abs(x);
		
		System.out.println("+++++++++++++++++" );
		System.out.println("First digit of the input number :  " + extract(x));
		}
    
	public static int extract(int a) {
		
		
		while(a >= 10)
		{
			a = a / 10;
		}	
		return a;
		
	}

}
