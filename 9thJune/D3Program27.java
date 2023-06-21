package d3activity;

import java.util.Scanner;

public class D3Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Double len, bdth, area, peri;
		System.out.println("Please input length : ");
		len = scan.nextDouble();
		System.out.println("Please input breadth : ");
		bdth = scan.nextDouble();
		
		area = len* bdth;
		peri = 2*(len+bdth);
		
		if (area > peri) {
			System.out.println("Area is greater than perimeter");
		} else if (peri > area){
			System.out.println("Perimeter is greater than Area");
		} else {
			System.out.println("Perimeter and Area are equal");
		}
	}

}
