import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// int input
/*		int number;
		
		System.out.print("Enter Your Age : ");
		number = input.nextInt();
		
		System.out.println("age : = "+number);
*/
				
		// string input
		String name;
		
		System.out.print("Enter Your Name : ");
		name = input.nextLine();
		
		System.out.println("Mr/Mrs : "+name);

				
	}
}