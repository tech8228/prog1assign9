package act6jun16;

import java.util.Random;
import java.util.Scanner;

public class act6q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, len=10, max=0, min=0 ;
		
		/*
		 * System.out.println("Please Enter the Length of array: "); len =
		 * scan.nextInt();
		 */
		int[] myarray = new int[len];
				
		for (i = 0; i < len; i++) {
			myarray[i] = rand.nextInt(100);
		}
		
		max = myarray[0];
		for (i = 1; i < myarray.length; i++)
            if (myarray[i] > max)
                max = myarray[i];
		
		min = myarray[0];
		for (i = 1; i < myarray.length; i++)
            if (myarray[i] < min)
                min = myarray[i];
		
		System.out.println("Array  is:  ");
		for (i = 0; i < len; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		System.out.println();
		System.out.println("Max value in array is :  "+ max);
		System.out.println("Max value in array is :  "+ min);
		
	}

}
