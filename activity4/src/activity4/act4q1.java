package activity4;

import java.util.Scanner;

public class act4q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	    double principle, interestRate, numOfYears, numOfYears2, profit;
	    principle = 1000;
	    interestRate = 0.0625;
	    numOfYears = 5;
	    
	    for (int i =0; i<2 ; ++i){
	        profit = (principle * interestRate * numOfYears);
	        System.out.println("Profit of Investment of "+numOfYears+" is : "+ profit );
	        numOfYears = 8;
	    }
	}

}
