import java.util.Scanner;
public class ElseStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.print("Enter Your Age : ");
		age = input.nextInt();
		
		if(age>=18){
		    System.out.print("Success");
		    }
		else{
		    System.out.print("Not Allow");
		    }
		
	}
}