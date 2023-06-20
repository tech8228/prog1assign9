package d3activity;

import java.util.Scanner;

public class D3Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int amount, cad100=0, cad50=0, cad20=0, cad10=0, cad5=0, count=0;
		System.out.println("Please input the Amount to check in CAD : ");
		amount = scan.nextInt();
				
		while(amount >= 100){
			cad100 = amount / 100;
			amount = amount % 100;
		}
		while(amount >= 50){
			cad50 = amount / 50;
			amount = amount % 50;
		}
		while(amount >= 20){
			cad20 = amount / 20;
			amount = amount % 20;
		}
		while(amount >= 10){
			cad10 = amount / 10;
			amount = amount % 10;
		}
		while(amount >= 5){
			cad5 = amount / 5;
			amount = amount % 5;
		}
		
		count = cad100 + cad50 + cad20 + cad10 + cad5;
		System.out.println("Total Number of paper Notes Excluding 2 and 1 canadian dollar COINs is: "+count);
	}

}
