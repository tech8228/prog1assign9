package activity4;

import java.util.Scanner;

public class act4q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int val;
		double avg, num, sum=0;
        System.out.println("Input number of entries for number input : ");
        val = scan.nextInt();
        System.out.println("You have to enter the number "+val+" times");
        
       
        for(int i=1;i<=val;i++)
    {
        System.out.println("Enter the Number :"); 
        num = scan.nextInt();
        sum = sum +num;
 
    }
        System.out.println("The Sum is : "+ (int)sum); 
        avg =sum/val;
        System.out.println("The Average is : "+ avg);
	}

}
