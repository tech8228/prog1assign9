package act6jun16;

import java.util.Random;
import java.util.Scanner;

public class act6q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int i, j, len = 3;
		int[][] a = new int[len][len];
		int[][] b = new int[len][len];
		int[][] c = new int[len][len]; 
		System.out.println("First Array  is:  ");
		for (i = 0; i < len; i++) {
			for ( j = 0; j < len; j++) {
			a[i][j] = rand.nextInt(100);
			System.out.print(a[i][j]+"  "); 
		}
			System.out.println();	
		}	
			
			System.out.println();	
			System.out.println("Second Array  is:  ");
			for (i = 0; i < len; i++) {
				for ( j = 0; j < len; j++) {
				b[i][j] = rand.nextInt(100);
				System.out.print(b[i][j]+"  "); 
			}
				System.out.println();	
			}
		
			System.out.println("++++++++++++++++++++++++++++");	
			System.out.println("Sum is: ");	
		for ( i = 0; i < a.length; i++) {
			for ( j = 0; j < b[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
