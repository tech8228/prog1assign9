package June16th;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int i, v ;
		int count  = 0 ;
		System.out.println("Please give me the size of array ? ");
		int size = kb.nextInt();
		int[] ar1 = new int[size];
		
		for (i = 0; i < ar1.length; i++) {
			ar1[i] = i * 5;
		}
		System.out.println("Here are my values in array 1 :  ");

		for(int x : ar1) {
			System.out.print(x + "  ");
		}
		
//		for (i = 0; i < ar1.length; i++) {
//			System.out.print(ar1[i] + "  ");
//		}
		System.out.println();
		System.out.println("Please enter the value you are searching?");
		v = kb.nextInt();

		for (i = 0; i < ar1.length; i++) {
			if(ar1[i] == v) {
				System.out.println("Value is found in index : " + i);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Value is not found " );
		}
		kb.close();
	}

}
