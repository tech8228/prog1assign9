package act6jun16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class act6q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, len , val=0 ;
		System.out.println("Enter the length of arrary  is:  ");
		len = scan.nextInt();
		while (len < 1){
			System.out.println("Enter the Valid length of arrary  :  ");
			len = scan.nextInt();
		}
		
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
				if (myarray[i] > myarray[j]) {
					val = myarray[i];
                    myarray[i] =    myarray[j];
                    myarray[j] =    val;
                    
			
				}
			}
		}
		System.out.println("Difference between the largest and smallest is :  "+ (myarray[myarray.length-1]-myarray[0]));
		
	      
	}

}
