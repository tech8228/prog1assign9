package d3activity;

import java.util.Scanner;

public class D3Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double hard, carbon, tensile;
		System.out.println("Please input steel Hardness : ");
		hard = scan.nextDouble();
		System.out.println("Please input steel Carbon content : ");
		carbon = scan.nextDouble();
		System.out.println("Please input steel Tensile Strength : ");
		tensile = scan.nextDouble();
		
		if (hard >50 && carbon <.7 && tensile > 5600) {
			System.out.println("Steel is Grade 10");
		} else if (hard >50 && carbon <.7) {
			System.out.println("Steel is Grade 9");
		}  else if (carbon <.7 && tensile > 5600) {
			System.out.println("Steel is Grade 8");
		}else if (hard >50 && tensile > 5600) {
			System.out.println("Steel is Grade 7");
		}else if (hard >50 || tensile > 5600 || carbon <.7) {
			System.out.println("Steel is Grade 6");
		}else {
			System.out.println("Steel is Grade 5");
		} 
	}

}
