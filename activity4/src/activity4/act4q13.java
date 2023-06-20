package activity4;

import java.util.Scanner;

public class act4q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int val, temp=1,sum=0;
         System.out.println("Enter number of terms for sum of the series : ");
         val = scan.nextInt();
         
        
         for(int i=1;i<=val;i++)
     {
        sum = sum+temp;
        temp =temp*10+1;
  
     }
         System.out.println("The Sum is : "+ sum); 
	}

}
