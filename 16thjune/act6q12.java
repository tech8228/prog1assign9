package act6jun16;

import java.util.Random;
import java.util.Scanner;

public class act6q12 {

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
			myarray2[i] = rand.nextInt(100);
		}
		
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
		
		
		for (i = 0; i < myarray.length; i++) {
			for (j = 0; j < myarray2.length ; j++) {
				if (myarray[i] == myarray2[j]) {
				System.out.println(myarray[i]+" element is duplicate "); 
				}
			}
		}
		
		
		
	}

}
