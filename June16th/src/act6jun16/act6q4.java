package act6jun16;

import java.util.Scanner;

public class act6q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i, len, val ;
		
		System.out.println("Please Enter the Length of array: ");
		len = scan.nextInt();
		int[] myarray = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = (i+1)* 5;
		}
		
		System.out.println("Please Enter the value to remove from array: ");
		val = scan.nextInt();
		
		for (i = 0; i < len; i++) {
			if (myarray[i] == val) { 
				myarray[i] = 0;
			}
		}
		
		System.out.println("Array with removed element is:  ");
		for (i = 0; i < len; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		
		
	}

}
