import java.util.Scanner;
public class IfStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter Your Age : ");
		age = input.nextInt();
		
		if(age>17){
		        System.out.print("Success");
		        }
	}
}