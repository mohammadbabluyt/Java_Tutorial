import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, result;
		
		System.out.print("Enter First Number: ");
		num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		num2 = input.nextInt();
		
		result = num1 + num2;
		System.out.println("যোগ : "+result);
		
		result = num1 - num2;
		System.out.println("বিয়োগ : "+result);
		
		result = num1 * num2;
		System.out.println("গুন : "+result);
		
	    double result2 = (double) num1 / num2;
		System.out.println("ভাগফল : "+result2);
		
		result = num1 % num2;
		System.out.println("ভাগশেষ : "+result);
		
	}
}