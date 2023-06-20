package d3activity;

import java.util.Scanner;

public class D3Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double ser;
		String gend, quali;
		System.out.println("Please input Gender \"m\" for Male and \"f\" for female : ");
		gend = scan.next();
		System.out.println("Enter Qualification \"g\" for Graduate and \"p\" for Post-Graduate : ");
		quali = scan.next();
		System.out.println("Enter years of Service : ");
		ser = scan.nextDouble();
		
		
		if (gend.equals("m")) {
			if (quali.equals("g")) {
				if (ser >= 10 ) {
					System.out.println("Salary for the driver is: 10000");
				} else {
					System.out.println("Salary for the driver is: 7000");
				}
			} else if (quali.equals("p")) {
				if (ser >= 10 ) {
					System.out.println("Salary for the driver is: 15000");
				} else {
					System.out.println("Salary for the driver is: 10000");
				}
			} else {
				System.out.println("Please provide correct details mq");
			}
		} else if (gend.equals("f")) {
			if (quali.equals("g")) {
				if (ser >= 10 ) {
					System.out.println("Salary for the driver is: 9000");
				} else {
					System.out.println("Salary for the driver is: 6000");
				}
			} else if (quali.equals("p")) {
				if (ser >= 10 ) {
					System.out.println("Salary for the driver is: 12000");
				} else {
					System.out.println("Salary for the driver is: 10000");
				}
			} else {
				System.out.println("Please provide correct details fq");
			}
		} else {
			System.out.println("Please provide correct details g");
		} 
	}

}
