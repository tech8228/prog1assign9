package act6jun16;

import java.util.Scanner;

public class act6q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		/*
		 * int i, len=0; Double avg=0.0 ;
		 * System.out.println("Please Enter the Length of array: "); len =
		 * scan.nextInt();
		 * 
		 * int[] myarr = new int[len]; for (i = 0; i< len; i++) {
		 * System.out.println("Please Enter the value: "); myarr[i] = scan.nextInt(); }
		 */
		int i;
		
		int[] ar1 = new int[10];
		ar1[0] = 2;
		ar1[1] = 5;
		ar1[2] = 77;
		ar1[3] = 22;
		ar1[4] = 99;
		ar1[5] = 18;
		ar1[6] = 22;
		ar1[7] = 7;
		ar1[8] = 12;
		ar1[9] = 81;
		
		System.out.println("Please give me number to check: ");
		int num = scan.nextInt();
		
		for (i = 0; i< ar1.length; i++) {
			if(ar1[i] == num) {
				System.out.println("Value found in the index  : " + i);
				break;
			}
		}
		
		if(i == ar1.length ) {
			System.out.println("There was no match");
		}
		
		
		
	}

}
