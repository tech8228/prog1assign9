package act6jun16;

import java.util.Scanner;

public class act6q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i, len=10, val, pos ;
		
		/*
		 * System.out.println("Please Enter the Length of array: "); len =
		 * scan.nextInt();
		 */
		int[] myarray = new int[len];
		int[] arr2 = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = (i+1)* 5;
		}
		
		System.out.println("Enter the element to be inserted :  ");
		val =  scan.nextInt();
		System.out.println("Enter the  index out of 10 :  ");
		pos =  scan.nextInt();
		
		myarray[pos]= val;
		
		System.out.println();
		System.out.println("Array after change is:  ");
		for (i = 0; i < myarray.length; i++) {
			System.out.println("Array["+i+"] : "+myarray[i]); 
		}
	}

}
