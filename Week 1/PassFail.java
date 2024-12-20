import java.util.Scanner;
public class PassFail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mark;
		
		System.out.print("Enter your Mark : ");
		mark = input.nextInt();
		
		if(mark>=33){
		        System.out.print("Pass");
		    }
		else{
		        System.out.print("Fail");
		    }
		
	}
}