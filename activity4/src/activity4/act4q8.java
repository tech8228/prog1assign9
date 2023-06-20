package activity4;

import java.util.Scanner;

public class act4q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
        double val, temp;
        System.out.println("Enter temperatue in Fahrenheit: ");
        val = scan.nextDouble();
       
       temp =(val-32)*5/9;
       
        System.out.println("Temperature in Celsius is: "+temp); 
	}

}
