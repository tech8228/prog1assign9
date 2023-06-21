package act6jun16;

import java.util.Random;
import java.util.Scanner;

public class act6q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int i, j, len=10  ;
		String ele;
		String[] sarray = {
                "Cabbage",
                "Kale",
                "Radish",
                "Onions",
                "Garlic",
                "Beetroot",
                "Cucumber",
                "Carrot",
                "Kale"
        };
		
		
		/*
		 * System.out.println("Please Enter the Length of array: "); ele = scan.next();
		 */
		 
					
	
		
		System.out.println("Array  is:  ");
		for (i = 0; i < sarray.length; i++) {
			System.out.print(sarray[i]+"  "); 
		}
		System.out.println();
		
		
		
		for (i = 0; i < sarray.length; i++) {
			for (j = i+1; j < sarray.length; j++) {
				if (sarray[i] == sarray[j]) {
				System.out.println(sarray[j]+" element string is duplicate "); 
				}
			}
			
		}
	}

}
