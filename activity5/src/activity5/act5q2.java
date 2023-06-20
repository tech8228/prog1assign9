package activity5;

import java.util.Scanner;

public class act5q2 {
	private static void cal(int p, int t, double intrate, int mo) {
		System.out.print("Years     Future Value");
		System.out.println();
		double val = p;
		double amount=0, compint=0; 
		for (int i=1; i<=t;i++) {
		
		amount = val* Math.pow(1+(intrate/mo), mo*i);
		compint= amount-p;
		 
		
		//System.out.println( i + "      "+compint);
		System.out.printf( "%d      %10.2f\n",i ,amount);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal(1000, 5, 0.1, 12);
	}
	
	

}
