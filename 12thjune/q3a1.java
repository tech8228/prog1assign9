package assign1;

import java.util.Random;
import java.util.Scanner;

public class q3a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int age,num;
			String fname, lname;
			System.out.println("Please Enter your first name: ");
			fname = scan.next();
			System.out.printf("%S, Please Enter your last name: ", fname);
			lname = scan.next();
			System.out.println("Please Enter your age: ");
			age = scan.nextInt();
			
			System.out.printf("Hello %S, you are %d old; nice to meet you!\n", lname, age );
			
			Random rand = new Random();
			int max = 50;
			int min = 1;
			int randnum = rand.nextInt(max -min)+min;
//			System.out.println(randnum);
			System.out.println("Please guess a number between 1 and 50: ");
			num = scan.nextInt();
			
			if (randnum == num ){
			    System.out.println("You are lucky");
			}else if (num > randnum){
			    System.out.println("Choose a smaller one,you were unlucky");
			} else {
			    System.out.println("Choose a bigger one,you were unlucky");
			}
			
	}

}
