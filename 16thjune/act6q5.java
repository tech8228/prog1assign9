package act6jun16;

import java.util.Scanner;

public class act6q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i, len, val ;
		
		System.out.println("Please Enter the Length of array: ");
		len = scan.nextInt();
		int[] myarray = new int[len];
		int[] arr2 = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = (i+1)* 5;
		}
		
		
		
		for (i = 0; i < len; i++) {
			arr2[i] = myarray[i];
			
		}
		System.out.println("Array  is:  ");
		for (i = 0; i < len; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		System.out.println();
		System.out.println("Copied Array  is:  ");
		for (i = 0; i < len; i++) {
			System.out.print(arr2[i]+"  "); 
		}
	}

}
