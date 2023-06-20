package d3activity;

import java.util.Scanner;

public class D3Program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, rev=0, remain, temp, i=0;
		System.out.println("Enter the Number to count digits: ");
		val = scan.nextInt();
		temp = val;
		
		if (val > 0) {
		while(val != 0)   
		{  
		remain = val % 10;  
		rev = rev * 10 + remain;  
		val = val/10;  
		i++;
		
		}  
			System.out.println(temp+ " has "+ i+" digits");
		
		} else {
			System.out.println("Number entered Negative number ");
		}
	}

}
