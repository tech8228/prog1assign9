package d3activity;

import java.util.Scanner;

public class D3Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double unit, price= 25, temp;
		System.out.println("Enter units of purchased item : ");
		unit = scan.nextDouble();
		
		temp= unit*price;
				
		if (unit > 100) {
			System.out.println("You get 10% discount. Total bill is :" + (temp *.9));
		} else {
			System.out.println("Total bill is :" +temp);
		}
	}

}
