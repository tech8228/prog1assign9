package d3activity;

import java.util.Scanner;

public class D3Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		System.out.println("Please input the First side of Triangle : ");
		a = scan.nextInt();
		System.out.println("Please input the Second side of Triangle : ");
		b = scan.nextInt();
		System.out.println("Please input the Third side of Triangle : ");
		c = scan.nextInt();
		
		if (a<b+c && b<a+c && c<a+b) {
			if (a== b && b==c) {
			System.out.println("Triangle is Equilateral");
			} else if (a==b || b==c || c==a){
			System.out.println("Triangle is  Isosceles");
				} else {
					System.out.println("Triangle is Scalene");
					}
		} else {
			System.out.println("Triangle is Not valid");
		}
		
		
	}

}
