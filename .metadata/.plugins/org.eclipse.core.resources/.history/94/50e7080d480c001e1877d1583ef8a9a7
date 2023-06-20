package activity5;

import java.util.Scanner;

public class act5q2 {
	private static void cal(int p, int t, double intrate, int mo) {
		System.out.print("Years     Future Value");
		System.out.println();
		double val = p;
		for (int i=1; i<=t;i++) {
		
		double amount = val* Math.pow(1+(intrate/mo), mo*t);
		double compint= amount-p;
		 val = val +compint;
		System.out.println(i+"       "+ val);
		//System.out.println("Compound Interest after " + t + " years: "+compint);
        //System.out.println("Amount after " + t + " years: "+amount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cal(1000, 5, 0.1, 12);
	}
	
	

}
