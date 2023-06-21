package activity5;

public class act5q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",PentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
    }
	public static int PentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
	

}
