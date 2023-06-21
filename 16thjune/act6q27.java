package act6jun16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class act6q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int i, j, len , val=0 , val2=0;
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
		
		Set<Integer> Single= new HashSet<>();
		for (i = 0; i < myarray.length; i++) {
			Single.add(myarray[i]);
			
		}
		
		
		
		System.out.println();
		val = myarray.length;
		
		for (i = 0; i < val; i++) {
			if (Single.contains(myarray[i]-1) == false) {
				int newlen =1;
				int newele = myarray[i];
				while (Single.contains(newele +1 ))
				{
					newlen = newlen +1;
					newele =  newele+1;
				}
				
				val2 = Math.max(val2, newlen);
			}
		
		}
				
		
		
		System.out.println("+++++++++++++++++++++++++++++++");
		for (int el: Single) {
			System.out.print(el+"  ");
		}
		System.out.println();
		System.out.print("Longest Sequence is  "+ val2);
		
	}

}
