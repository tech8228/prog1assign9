package Class2;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int mynum = 9;
//		
//		double myDouble = mynum;
//		System.out.println(mynum);
//		System.out.println(myDouble);
//		
//		double avg = 22.4;
//		int intavg = (int) avg;
		
		
		//widening casting  int -> double
		int myint = 11;
		double doublenum = myint;
		
		//narrowing double -> int
		
		double avg = 329.99;
		int myintavg = (int) avg;
		System.out.println(myintavg);
		
		/*
		  Widening Casting (automatically) - converting a smaller type to a larger type size
					byte -> short -> char -> int -> long -> float -> double

		  Narrowing Casting (manually) - converting a larger type to a smaller size type
					double -> float -> long -> int -> char -> short -> byte

		 
		 */
		
		
	}

}
