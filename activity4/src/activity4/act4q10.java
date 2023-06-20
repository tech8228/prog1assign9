package activity4;

import java.util.Scanner;

public class act4q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scan = new Scanner(System.in);
	        
           double a, b, c; 
           System.out.println("Enter first number: ");
           a = scan.nextDouble();
            System.out.println("Enter Second number: ");
           b = scan.nextDouble();
            System.out.println("Enter Third number: ");
           c = scan.nextDouble();
           
           System.out.println("Average of three numbers is : "+ (a+b+c)/3); 
	}

}
