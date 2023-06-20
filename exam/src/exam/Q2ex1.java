package exam;

import java.util.Scanner;

public class Q2ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char alpha1, check;
		int len;
		String beta;
		System.out.println(" Input an alphabet: ");
		beta = scan.next();
		len = beta.length();
		alpha1 = beta.charAt(0);
		
		String alpha = String.valueOf(Character.toLowerCase(alpha1)) ;
		
		if (len > 1  ) {
			System.out.println("Please input single character alphabet ");
		} else {
		if (Character.isDigit(alpha1)) {
			System.out.println("Please input single character alphabet we ");
		}else {
		
		
		if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i")||alpha.equals("o")||alpha.equals("u")  ) {
			System.out.println("Input letter is Vowel ");
		}else {
			System.out.println("Input letter is Consonant");
		}
		}
		}
	}

}
