package activity4;

import java.util.Scanner;

public class act4q11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int val, temp;
         System.out.println("Enter Number to get pattern : ");
         val = scan.nextInt();
  
         
         
        
         for(int i=0; i < val;i++)
     {
        	 
        	 temp= val-i;
        	 for (int j=1;j<=i+1;j++ ) {
        	 System.out.print(temp);
        	 temp=temp+1;
        	 }
        	 System.out.println();
     }
	}

}
