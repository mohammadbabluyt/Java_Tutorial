import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print("Enter Positive Number : ");
		age = input.nextInt();
		
		if(age>0){
		    System.out.print("Posetive");
		    }
		else if(age<0){
		    System.out.print("Negetive");
		    }
		 else{
		     System.out.print("zero");
		     }
		
	}
}