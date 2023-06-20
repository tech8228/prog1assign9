package June16th;

import java.util.Random;
import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int sz, i, j;
		Random rand = new Random();
		System.out.println("Please give me 2 size for ar 2 dimentin ? ");
		sz = kb.nextInt();

		int[][] arr = new int[sz][sz];
		
		for (i = 0; i < sz; i++) {
			for (j = 0; j < sz; j++) {
				arr[i][j] = rand.nextInt(2);
			}
		}

		System.out.println("Here are my array  :  ");

		for (i = 0; i < sz; i++) {
			for (j = 0; j < sz; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
