package D2assign;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val1;
		System.out.println("Please input the Decimal Number : ");
		val1 = scan.nextInt();
		
		String bin =  Integer.toBinaryString(val1);
		
		System.out.print("Binary number is: "+ bin);
		
	}

}
