package June16th;

import java.util.Random;
import java.util.Scanner;

public class j16q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner (System.in);
		int i, j;
		Random rand = new Random();
		int[][] arr = new int[6][10]; //6 rows and 10 col
		
		for (i= 0; i<6; i++) {
			for (j=0; j< 10; j++) {
				
				arr[i][j] = rand.nextInt(100);
			}
		}
		
		System.out.println("Here is my array :  ");
		
		for (i= 0; i<6; i++) {
			for (j=0; j< 10; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		for (int[] el: arr) {
			for (int dl: arr) {
				System.out.printf("%4d", arr[i][j]);
			}
		}
		
		
		
		
	}

}
