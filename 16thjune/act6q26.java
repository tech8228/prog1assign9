package act6jun16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class act6q26 {

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
		
		myarray[4] =10;
		myarray[7] =10;
		System.out.println();
		val = myarray.length;
		for (i = 0; i < val; i++) {
			for (j = i+1; j < val ; j++) {
				if (myarray[i] == myarray[j]) {
					myarray[j] = myarray[val-1];
					System.out.println(myarray[j]+" element string is duplicate "); 
                    val--;
                     
                    j--;
                    
			
				}
			}
	/*	for (i = 0; i < myarray.length-1; i++) {
			
				if (myarray[i] != myarray[i+1]) {
					temp[val++]=myarray[i];
              }
			
		}
		
		temp[val++]= myarray[i-1];
		System.out.println(val);*/
		for (i = 0; i < val; i++) {
			
			System.out.print(myarray[i]+"  ");
		}
		}
	       
	}
}
