package D2assign;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int repeat= 1;
		int val1;
		System.out.println("Input a number : ");
		val1 = scan.nextInt();
		
		do {
			int out =  val1 * repeat;
			System.out.println( val1 + " x " +repeat + " = " +  out);
			repeat++;
		}while (repeat <= 10);
	}

}
