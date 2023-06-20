package d3activity;

import java.util.Scanner;

public class D3Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double carrot= 2, onions=4, meat=10,  a, b, c, total;
		String card;
		System.out.println("Enter the carrots in lb : ");
		a = scan.nextDouble();
		System.out.println("Enter the onions in lb : ");
		b = scan.nextDouble();
		System.out.println("Enter the meat in lb : ");
		c = scan.nextDouble();
		
		total = carrot *a + onions *b + meat *c;		
		System.out.println("The total bill in CAD is: " + total + "\n");
		
		System.out.println("--------------Choose Payment Type:--------------");
		System.out.println("For Card payment(includes 13% HST), type \"y\"" );
		System.out.println("OR");
		System.out.println("For Cash payment, type \"n\"");
		card = scan.next();
		
		if (card == "y") {
			System.out.println("The Final Total Amount bill is: "+ total*1.13);
		} else {
			System.out.println("The Final Total Amount bill is: "+ total);
		}
		
		
	}

}
