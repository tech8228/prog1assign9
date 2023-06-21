package activity4;

import java.util.Scanner;

public class act4q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
        double a, b, c, val, r1, r2;
        System.out.print("Input a variable: ");
        a = scan.nextDouble();
        System.out.print("Input b variable: ");
        b = scan.nextDouble();
        System.out.print("Input c variable: ");
        c = scan.nextDouble();

        val = b * b - 4.0 * a * c;

        if (val > 0) {
            r1 = (-b + Math.pow(val, 0.5)) / (2 * a);
            r2 = (-b - Math.pow(val, 0.5)) / (2 * a);
            System.out.println("The roots are "+ r1 +" and "+ r2);
        } else if (val == 0) {
            r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
	}

}
