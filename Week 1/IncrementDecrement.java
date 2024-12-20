public class IncrementDecrement {
	public static void main(String[] args) {
		
		int x = 24;
		int y;
		
		y = x++; // postfix increment
		System.out.println("y = "+y);
		
		y = x;
		System.out.println("y = "+y); 
		
		y = ++x; // prefix increment
		System.out.println("y = "+y);
		
		y = x;
		System.out.println("y = "+y);
		
		y = --x; // prefix decrement
		System.out.println("y = "+y);
		
		y = x;
		System.out.println("y = "+y);
		
		y = x--; // postfix decrement
		System.out.println("y = "+y);
		
		y = x;
		System.out.println("y = "+y);
		
	}
}