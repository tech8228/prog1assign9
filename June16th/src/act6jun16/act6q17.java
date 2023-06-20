package act6jun16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class act6q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, len =10 ;
		int[] myarray = new int[len];
		int[] myarray2 = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = rand.nextInt(100);
		}
		
		for (i = 0; i < len; i++) {
			myarray2[i] = myarray[i];
		}
		/*
		 * for (i = 0; i < len; i++) { myarray2[i] = rand.nextInt(100); }
		 */
		System.out.println("First Array  is:  ");
		for (i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		System.out.println();
		System.out.println("Second Array  is:  ");
		for (i = 0; i < myarray2.length; i++) {
			System.out.print(myarray2[i]+"  "); 
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		boolean status = Arrays.equals(myarray, myarray2);
	      System.out.println("Array are EQUAL: " + status);
		
		
	}

}
