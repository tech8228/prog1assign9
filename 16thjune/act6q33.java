package act6jun16;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class act6q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, k, l,  val=0 ;
		/*
		 * int l;
		 * System.out.println("Enter the length of arrary  is:  "); len =
		 * scan.nextInt(); while (len < 1){
		 * System.out.println("Enter the Valid length of arrary  :  "); len =
		 * scan.nextInt(); }
		 * 
		 * int[] myarray = new int[len]; int[] temp = new int[len]; for (i = 0; i < len;
		 * i++) { myarray[i] = rand.nextInt(100); }
		 * 
		 * 
		 * 
		 * System.out.println("First Array  is:  "); for (i = 0; i < myarray.length;
		 * i++) { System.out.print(myarray[i]+"  "); }
		 */
		System.out.println();
		int myarray[]= {6, 7, 9, -4, 25, 12, -7, 40};
		int len = myarray.length;
		

		System.out.println();
		
		l=0;
		for (i = 0; i < myarray.length; i++) {
			
				if (myarray[i] < 0) {
				
					if (i != l) {
						
					val = myarray[i];
                    myarray[i] =    myarray[l];
                    myarray[l] =    val;
					}
					l++;
				}	
			
		}
		for (int ele: myarray) {
			System.out.print(ele+ "  ");
		}
		
		
	}

}
