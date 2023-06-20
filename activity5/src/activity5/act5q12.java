package activity5;

import java.util.Scanner;

public class act5q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int x, y, z, area;
		String word;
		System.out.println("Enter a word :  " );
		word= scan.next();
		
		
		System.out.println("+++++++++++++++++" );
		System.out.println("All the characters in this word is vowel :  " + extract(word));
		}
    
	public static boolean extract(String a) {
		
		
		String vowels = "aeiou";
	    String word1 = a.toLowerCase();
	    for (int i = 0; i < word1.length(); i++) {
	      if (vowels.indexOf(word1.charAt(i)) == -1)
	        return false;
	    }
	    return true;
	}

}
