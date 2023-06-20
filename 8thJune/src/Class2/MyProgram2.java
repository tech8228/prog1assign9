package Class2;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int val1, val2;
		System.out.println("Please give me the first int  num?");
		val1 = kb.nextInt();
		System.out.println("Please give me the second int  num?");
		val2 = kb.nextInt();
		System.out.println("Your first integer is " + val1);
		System.out.println("Your second integer is " + val2);
		System.out.println("=====================");
		
		int add,sub,mult,div,mod;
		add = val1 + val2;
		sub = val1 - val2;
		mult = val1 * val2;
		div = val1 /val2;
		mod = val1 % val2;
				
		System.out.println("the addition in int is " + add);
		System.out.println("the subtraction in int is " + sub);
		System.out.println("the mult in int is " + mult);
		System.out.println("the divition in int is " + div);
		System.out.println("the reminder in int is " + mod);
		System.out.println("=====================");
		
		
		double dval1, dval2;
		System.out.println("Please give me the first double  num?");
		dval1 = kb.nextDouble();
		System.out.println("Please give me the second double  num?");
		dval2 = kb.nextDouble();
		System.out.println("Your first double is " + dval1);
		System.out.println("Your second double is " + dval2);
		System.out.println("=====================");
		
		
		double dadd,dsub,dmult,ddiv,dmod;
		dadd = dval1 + dval2;
		dsub = dval1 - dval2;
		dmult = dval1 * dval2;
		ddiv = dval1 /dval2;
		dmod = dval1 % dval2;
		
		System.out.println("the addition in double is " + dadd);
		System.out.println("the subtraction in double is " + dsub);
		System.out.println("the mult in double is " + dmult);
		System.out.println("the divition in double is " + ddiv);
		System.out.println("the reminder in double is " + dmod);
		System.out.println("=====================");
		
		
	}

}
