package June16th;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'g','r','o','u','p',' ','7','0'};
		String[] arr2 = {"pargol","Poshtareh"};
		System.out.println("Here are my array  :  ");
		
		for(char c : arr) {
			System.out.print(c + " ");
		}
		arr[3] = '0';
		
		
		for(char c : arr) {
			System.out.print(c + " ");
		}
	}

}
