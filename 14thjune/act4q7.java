package activity4;

import java.util.Scanner;

public class act4q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        
          int val, temp=1;
          System.out.println("Enter Factorial value: ");
          val = scan.nextInt();
         
          for(int i=1;i<=val;i++)
      {
          temp=temp*i;
      }
      System.out.println("Factorial of the number "+val+" is: "+temp); 
          
	}

}
