package d3activity;

import java.util.Scanner;

public class D3Program35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, temp;
		System.out.println("Enter any ingeter to check multiple of 5 : ");
		val = scan.nextInt();
		temp = val% 5;
		
		if (temp == 0) {
			System.out.println("Number is multiple of 5 ");
		} else  {
			System.out.println("Number is not multiple of 5");
		} 
	}

}
