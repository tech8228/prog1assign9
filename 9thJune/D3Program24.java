package d3activity;

import java.util.Scanner;

public class D3Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int ram, shyam, ajay, temp;
		System.out.println("Enter Ram's Age : ");
		ram = scan.nextInt();
		System.out.println("Enter Shyam's Age : ");
		shyam = scan.nextInt();
		System.out.println("Enter Ajay's Age : ");
		ajay = scan.nextInt();
		
		if (ram< shyam && ram< ajay) {
			System.out.println("The youngest is Ram ");
		} else if (shyam<ram && shyam < ajay){
			System.out.println("The youngest is Shyam ");
		}else {
			System.out.println("The youngest is Ajay ");
		}
		
	}

}
