package d3activity;

import java.util.Scanner;

public class D3Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, rev=0, remain, temp;
		System.out.println("Enter 5 digit number : ");
		val = scan.nextInt();
		temp = val;
		
		if (val >9999 && val < 100000) {
		while(val != 0)   
		{  
		remain = val % 10;  
		rev = rev * 10 + remain;  
		val = val/10;  
		}  
		if (rev == temp) {
			System.out.println("Original and Reserve are equal ");
		} else {
			System.out.println("Original and Reserve are different "+ rev);
		}
		
		} else {
			System.out.println("Number entered is not 5 digit. ");
		}
	}

}
