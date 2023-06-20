package D2assign;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double val1, val2, val3, avg;
		System.out.println("Please input the First number : ");
		val1 = scan.nextDouble();
		System.out.println("Please input the Second number : ");
		val2 = scan.nextDouble();
		System.out.println("Please input the Third number : ");
		val3 = scan.nextDouble();
		
		avg = (val1+val2+val3)/3;
		System.out.println("Average value is = "+ avg);
	
	}

}
