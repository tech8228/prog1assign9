package d3activity;

import java.util.Scanner;

public class D3Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Double cp, sp, temp;
		System.out.println("Please input the Cost Price : ");
		cp = scan.nextDouble();
		System.out.println("Please input the Selling Price : ");
		sp = scan.nextDouble();
		
		temp = sp-cp;
		if (temp<0) {
			System.out.println("Your LOSS is : " + Math.abs(temp));
		}else if (temp>0) {
			System.out.println("Your PROFIT is : " + temp);
		}else {
			System.out.println("There is no Profit or Loss" );
		}
			
	}

}
