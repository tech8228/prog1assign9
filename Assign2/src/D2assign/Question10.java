package D2assign;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double val1, val2, val3;
		System.out.println("Please input the First number : ");
		val1 = scan.nextDouble();
		System.out.println("Please input the Second number : ");
		val2 = scan.nextDouble();
		
		System.out.println("Before swap ");
		System.out.println("First number : "+ val1);
		System.out.println("Second number : " + val2);
		
		val3 = val1;
		val1 = val2;
		val2 = val3;
		
		System.out.println("After swap ");
		System.out.println("Now First number : "+ val1);
		System.out.println("Now Second number : " + val2);
		
	}

}
