package activity5;

import java.util.Scanner;

public class act5q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int x, y, z, area; 
		System.out.println("Enter the Number for factor only of  3 :  " );
		x= scan.nextInt();
		x= Math.abs(x);
		extract(x);
		
		}
    
	public static void extract(int a) {
		
		int i,val =a ;
        System.out.format("Factors of %d\n", a);
        System.out.print(1 + " ");
        while(a > 2) {
        	
            if (a % 3 == 0) {
            	
            	  System.out.print(3 + " ");
            	 
            } a =a/3;
         
        }
		
	}

}
