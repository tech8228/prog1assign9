package act6jun16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class act6q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, k, l, len , val=0 , val2=0, val3=0,val4=0, val5=0;
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
		System.out.println("Enter Number to check for sum:  ");
		val = scan.nextInt();
		
		for ( i = 0; i < len - 3; i++) 
	        {
	        for ( j = i + 1; j < len - 2; j++) 
	            {
	              for ( k = j + 1; k < len - 1; k++) 
	                {
	                    for ( l = k + 1; l < len; l++) 
	                    {
	                        if (myarray[i] + myarray[j]+ myarray[k] + myarray[l] == val) 
	                            System.out.print("\n"+myarray[i] + " "+myarray[j]+" "+myarray[k] + "  "+myarray[l]);
	                    }
	                }
	            }
	    }
		
	
	      
	}

}
