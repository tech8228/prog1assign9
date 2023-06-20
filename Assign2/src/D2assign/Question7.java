package D2assign;

import java.util.Random;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int max = 22;
		int min = 1;
		int repeat= 1;
		
		
		
		do {
		int randnum = rand.nextInt(max -min)+min;
		System.out.println(repeat +" Random Number is:  " + randnum);
		repeat++;
		}while (repeat <= 10);
		
	}

}
