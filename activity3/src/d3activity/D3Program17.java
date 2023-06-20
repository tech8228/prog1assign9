package d3activity;

import java.util.Scanner;

public class D3Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double elec;
		System.out.println("Enter your Electricity unit : ");
		elec = scan.nextInt();
		
		if (elec <=50) {
			System.out.println("Total Electricity Bill is :" + (elec*0.5*1.2));
		} else if (elec <= 50+150) {
			System.out.println("Your GROSS salary is :" + ((50*.5)+((elec-50)*0.75))*1.2);
		} else if (elec <= 50+150+250) {
			System.out.println("Your GROSS salary is :" + ((50*.5)+(150*0.75)+((elec-200)*1.2))*1.2);
		}  
		else {
			System.out.println("Your GROSS salary is :" + ((50*.5)+(150*0.75)+(450*1.2)+((elec-250)*1.5))*1.2);
		}
	}

}
