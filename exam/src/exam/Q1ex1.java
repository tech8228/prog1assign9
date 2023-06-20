package exam;

import java.util.Scanner;

public class Q1ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int prepay, app = 3 , song=7, buyapp, buysong, remapp, remsong, remsongapp=0, remsongapp1=0;
		System.out.println(" How much do you wish to prepay? ");
		prepay = scan.nextInt();
		
		buyapp= prepay/app;
		remapp=   prepay% app;
		
		buysong = prepay/song;
		remsong =prepay%song;
		if (remsong !=0) {
			remsongapp = remsong/app;
			remsongapp1= remsong%app;
		}
		
		System.out.println("With this amount, you will be able to purchase " + buyapp+" apps. You will then have " + remapp+" $ left as credit on your account");

		System.out.println("Alternatively, for this amount, you will be able to purchase " + buysong+" songs and " + remsongapp+ " apps. You will then have " + remsongapp1+" $ left as credit on your account.");
		System.out.println("********** Thanks for Shopping at Best Music Store! ************ ");
	}

}
