package activity4;

import java.util.Scanner;

public class act4q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	    int num1, num2, num3, num4, temp=0, i;
		
		
	    for (i=0; i<4; ++i){
	    System.out.println("Enter the Number : ");
		num1 = scan.nextInt();
		if (num1 >temp){
		    temp= num1;
		}
	    }
		 System.out.println("Enter Greatest Number is: "+ temp);   
	}

}
