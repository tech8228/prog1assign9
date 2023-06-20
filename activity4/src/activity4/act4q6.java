package activity4;

import java.util.Scanner;

public class act4q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			
	        int a=0, b=1, c=0, i, val;
         //System.out.print("Enter the maximum limit of Fibonacci series: ");
         //val = scan.nextInt();
         val = 300;
        
         System.out.print(a+" "+b);
         
         for (i=1; i<val; i=c){
           
             c= a +b;
         if (c < val) { 
             System.out.print(" "+c);
             a =b;
             b=c;   
         }
         }
	}

}
