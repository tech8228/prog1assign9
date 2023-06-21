package act6jun16;

import java.util.Scanner;

public class act6q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i, len=0;
		Double avg=0.0 ;
		System.out.println("Please Enter the Length of array: ");
		len = scan.nextInt();
		
		int[] myarr = new int[len];
		for (i = 0; i< len; i++) {
			System.out.println("Please Enter the value: ");
			myarr[i] = scan.nextInt();
		}
		
		for (i = 0; i< len; i++) {
			avg = avg+ myarr[i];
		}
		
		System.out.println("Average value of the value is : "+ avg/len);
		
	}

}
