package d3activity;

import java.util.Scanner;

public class D3Program34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
		 
			double num1, num2, out=0;
		    System.out.println("Enter the First number:");
	        num1 = scan.nextDouble();
	        
	        System.out.println("Enter the operator (+,-,*,/):");
	        char op = scan.next().charAt(0);
	        
	        System.out.println("Enter the Second number:");
	        num2 = scan.nextDouble();
	 
	       
	        	 
	        switch (op) {
	        case '+':
	            out = num1 + num2;
	            break;
	 
	        case '-':
	            out = num1 - num2;
	            break;
	 
	        case '*':
	            out = num1 * num2;
	            break;
	 
	        case '/':
	            out = num1 / num2;
	            break;
	 
	        default:
	            System.out.println("You enter wrong input");
	        }
	 
	        System.out.println("Calculated value:");
	        System.out.println(num1 + " " + op + " " + num2 + " = " + out);
	    
	}

}
