package D2assign;


public class Question3 {

	static final Double RADIUS = 7.5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double area, perimeter;
		
		area = Math.PI*(Math.pow(RADIUS,2));
		perimeter = 2*Math.PI*RADIUS;
		
		System.out.println("Perimeter is = "+ perimeter);
		System.out.println("Area is = "+ area);
	}

}
