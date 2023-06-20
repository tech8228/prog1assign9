package D2assign;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double Width, Height, Area, Perimeter;
		System.out.println("Please input the Width of the Rectangle : ");
		Width = scan.nextDouble();
		System.out.println("Please input the Height of the Rectangle : ");
		Height = scan.nextDouble();
		
		Area = Width * Height;
		Perimeter = 2*(Width+Height);
		
		
		System.out.printf("Area is = %.2f %n", Area);
		System.out.printf("Perimeter is = %.2f", Perimeter);
		
	}

}
