package activity5;

import java.util.Scanner;

public class act5q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int x, y, z, area;
	
		System.out.println("Enter the Number :  " );
		x= scan.nextInt();
		x= Math.abs(x);
		
		System.out.println("+++++++++++++++++" );
		System.out.println("All the digit is even :  " + extract(x));
		}
    
	public static boolean extract(int a) {
		
		
		while(a != 0){
		   if((a % 10) % 2 != 0){
			   return false;
		   }
		        a =a/10;
		}
		return true;
	}

}
