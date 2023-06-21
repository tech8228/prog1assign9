package activity4;

import java.util.Scanner;

public class act4q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val;
         System.out.println("Enter Number to get Multiplication table : ");
         val = scan.nextInt();
         
        
         for(int i=1;i<=10;i++)
     {
        	 System.out.println(val+" X "+i+" = "+val*i);
  
     }
          
	}

}
