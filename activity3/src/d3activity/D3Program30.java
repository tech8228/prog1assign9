package d3activity;

import java.util.Scanner;

public class D3Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double hr;
		System.out.println("Enter time taken to do job in \"hr\" : ");
		hr = scan.nextDouble();
		
		
		if (hr <= 3) {
			System.out.println("You are highly efficient ");
		} else if (hr <= 4 ) {
			System.out.println("You need to improve speed");
		}  else if (hr <= 5) {
			System.out.println("You will be given training and need to improve speed");
		} else  {
			System.out.println("Service is cancelled");
		} 
	}

}
