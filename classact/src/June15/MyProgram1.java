package June15;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please put your year");
		int year = kb.nextInt();
		boolean result =is_leapYear(year);
		if(result) {
			System.out.println("yes is leap");
		}else {
			System.out.println("Nope");
		}
	}
	
	
	public static boolean is_leapYear(int y) {
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y %100 ==0)&&(y%400 ==0));
		return a && (b ||c );		
	}

}
