package act6jun16;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class act6q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, len =10 ;
		int[] myarray = new int[len];
		int[] temp = new int[len];
		
		for (i = 0; i < len; i++) {
			myarray[i] = rand.nextInt(100);
		}
		
		
		int val = myarray.length;
		System.out.println("First Array  is:  ");
		for (i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		System.out.println();
		
		
		for (i = 0; i < val; i++) {
			for (j = i+1; j < val ; j++) {
				if (myarray[i] == myarray[j]) {
					myarray[j] = myarray[val-1];
					System.out.println(myarray[j]+" element string is duplicate "); 
                    val--;
                     
                    j--;
                    
			
				}
			}
		}
		System.out.println("final array  is:  ");
		for (i = 0; i < val; i++) {
			System.out.print(myarray[i]+"  "); 
		}
		
		System.out.println();
		
		
	}

}
