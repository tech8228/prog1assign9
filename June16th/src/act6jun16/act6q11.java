package act6jun16;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class act6q11 {

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
                "orange",
                "Cucumber",
                "Carrot",
                "Kale"
        };
		
		String[] sarray2 = {
                "Red",
                "green",
                "purple",
                "Onions",
                "Garlic",
                "Beetroot",
                "orange",
                "Carrot",
                "black"
        };
			
		Set<String> list= new HashSet<String>();
		System.out.println("Array  is:  ");
		for (i = 0; i < sarray.length; i++) {
			System.out.print(sarray[i]+"  "); 
		}
		System.out.println();
		System.out.println("Array  is:  ");
		for (i = 0; i < sarray2.length; i++) {
			System.out.print(sarray2[i]+"  "); 
		}
		System.out.println();
		
		
		
		for (i = 0; i < sarray.length; i++) {
			for (j = 0; j < sarray2.length; j++) {
				if (sarray[i] == sarray2[j]) {
				list.add(sarray[i]);
				}
			}
			
		}
		System.out.println();
		for (String ex : list) {
            System.out.print(ex + " ");
        }
	}

}
