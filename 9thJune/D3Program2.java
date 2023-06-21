package d3activity;

import java.util.Scanner;

public class D3Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Double val1, val2, val3, val4, temp;
		System.out.println("Please input the First Number : ");
		val1 = scan.nextDouble();
		System.out.println("Please input the Second Number : ");
		val2 = scan.nextDouble();
		System.out.println("Please input the Third Number : ");
		val3 = scan.nextDouble();
		System.out.println("Please input the Fourth Number : ");
		val4 = scan.nextDouble();
		
		temp = Math.max(val1,  val2);
		temp = Math.max(temp,val3);
		temp = Math.max(temp,val4);
		
		System.out.println("Greatest number is: "+ temp);
	}

}
