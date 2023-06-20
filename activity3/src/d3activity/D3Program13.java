package d3activity;

import java.util.Scanner;

public class D3Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double root1 = 0, root2 = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the value of a :");
	    double a = scan.nextDouble();

	    System.out.println("Enter the value of b :");
	    double b = scan.nextDouble();

	    System.out.println("Enter the value of c :");
	    double c = scan.nextDouble();

	    double determinant = (b*b)-(4*a*c);
	    double sqrt = Math.sqrt(determinant);

	    if(determinant>0){
	       root1 = (-b + sqrt)/(2*a);
	       root2 = (-b - sqrt)/(2*a);
	       System.out.println("Roots are : "+ root1 +" and "+root2);
	    }else if(determinant == 0){
	       System.out.println("Root is : "+(-b + sqrt)/(2*a));
	    }
	}
	

}
