package activity4;

import java.util.Scanner;

public class act4q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val;
         System.out.println("Enter number to see the cube of : ");
         val = scan.nextInt();
        
         for(int i=1;i<=val;i++)
     {
        
         System.out.println("Number is : "+i+" and cube of the "+i+" is: "+ (int)Math.pow(i, 3)); 
     }
     
         
	}

}
