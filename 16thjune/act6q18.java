package act6jun16;

import java.util.Random;
import java.util.Scanner;

public class act6q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		
		/*
		 * System.out.println("Please Enter the Length of array: ");
		 *  len = scan.nextInt();
		 */
		int[] arr = { 1, 2, 4, 5, 6};
		int val = arr.length;
		int a=arr[0], b=0, len=10  ;
		/*For xor of all the elements in array */
        for (int i = 1; i < val; i++)
            a = a ^ arr[i];
 
        /* For xor of all the elements from 1 to n+1 */
        for (int i = 1; i < val +1; i++)
            b = b ^ i;
        int x = a^b;
        
        System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println(" Missing Number is : "+ x);
       
				
		
	}

}
