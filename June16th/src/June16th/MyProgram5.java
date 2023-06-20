package June16th;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int sz1, sz2, i;
		System.out.println("Please give me 2 size for ar1 and ar2 ? ");
		sz1 = kb.nextInt();
		sz2 = kb.nextInt();

		int[] ar1 = new int[sz1];
		int[] ar2 = new int[sz2];

		for (i = 0; i < ar1.length; i++) {
			ar1[i] = i * 5;
		}

		// cond
		if (ar1.length == ar2.length) {
			for (i = 0; i < ar2.length; i++) {
				ar2[i] = ar1[i];
			}
		} else if (ar1.length > ar2.length) {
			System.out.println("Here the len ar 2 is smaller");
			for (i = 0; i < ar2.length; i++) {
				ar2[i] = ar1[i];
			}
		} else {
			System.out.println("Here the len ar1 is smaller");
			for (i = 0; i < ar1.length; i++) {
				ar2[i] = ar1[i];
			}
		}

		System.out.println("+++++++++++++++++");

		System.out.println("Here are my values in array 1 :  ");

		for (i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + "  ");
		}
		System.out.println();

		System.out.println("Here are my values in array 2 :  ");
		for (i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + "  ");
		}

	}

}
