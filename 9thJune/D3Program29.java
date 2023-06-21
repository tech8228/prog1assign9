package d3activity;

import java.util.Scanner;

public class D3Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double late;
		System.out.println("Enter number of Days for late return : ");
		late = scan.nextDouble();
		
		
		if (late <= 5) {
			System.out.println("Fine for Late return is : "+ late*.5);
		} else if (late <= 10 ) {
			System.out.println("Fine for Late return is : "+ (5*.5+(late-5)*1));
		}  else if (late <= 30) {
			System.out.println("Fine for Late return is : "+ (5*.5+5*1+(late-10)*5));
		} else  {
			System.out.println("Membership is CANCELLED");
		} 
	}

}
