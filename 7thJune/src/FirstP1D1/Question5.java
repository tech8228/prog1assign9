package FirstP1D1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of \"a\" : ");
		Scanner val = new Scanner(System.in);
		
		int a=  val.nextInt();
		System.out.print("Enter the value of \"b\" : ");
		int b=  val.nextInt();
		
		System.out.print("Enter the value of \"c\" : ");
		int c=  val.nextInt();
		
		int outpt = a+b+c;
		System.out.print("Sum of the numbers is : ");
		System.out.println(outpt);
	}

}
