package activity5;

import java.util.Random;
import java.util.Scanner;

public class act5q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
			int len,count = 1;
			System.out.println("Enter the array n-by-n matrix size::  " );
			len = scan.nextInt();
			genarray(len);
			}
	    
		public static void genarray(int a) {
			
			int i, j;
			int[][] myarr= new int[a][a];
			for (i=0; i< a; i++) {
				for(j=0;j<a;j++) {
					myarr[i][j]= (int) Math.round(Math.random());
					System.out.print(myarr[i][j]+ "  ");
				}
				System.out.println();
			}
		}
	

}
