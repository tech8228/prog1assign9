package activity4;

import java.util.Scanner;

public class act4q11d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, temp;
         System.out.println("Enter Number to get pattern : ");
         val = scan.nextInt();
  
         
         
        
         for(int i=0; i <=val-1;i++)
         {
        	 
        	
        	 for (int j=0;j<=i;j++ ) {
        		 System.out.print(" ");
        		 }
        	for (int k=0;k<=val-1-i;k++) {
        			 System.out.print("*"+" ");
        		 }
        	 
        	 System.out.println();
     	}
	}

}
