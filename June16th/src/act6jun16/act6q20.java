package act6jun16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class act6q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, len =10, val=0 ;
		int[] myarray = new int[len];
		int[] temp = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = rand.nextInt(100);
		}
		
		
		
		System.out.println("First Array  is:  ");
		for (i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		System.out.println();
	
		for (i = 0; i < myarray.length; i++) {
			for (j = i+1; j < myarray.length ; j++) {
				if (myarray[i] == 0) {
					val = myarray[j];
                    
                    myarray[i] =    val;
                    myarray[j] = 0 ;
			
				}
			}
		}
		System.out.println("Array  is:  ");
		for (i = 0; i < myarray.length; i++) {
			if ((myarray[i] % 2) == 0) {
			System.out.print(myarray[i]+" is even");
			System.out.println();
			}else {
				System.out.print(myarray[i]+" is odd");
				System.out.println();
				
			}
		}
		
		
	      
	}

}
