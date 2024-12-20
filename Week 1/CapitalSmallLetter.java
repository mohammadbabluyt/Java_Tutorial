import java.util.Scanner;
public class CapitallSmall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char lett;
		
		System.out.print("Enter any Letter : ");
		lett = input.next().charAt(0);
		
		if(lett>='A' && lett<='Z'){
		        System.out.println("Capital Letter");
		    }
		  else{
		          System.out.print("Small Letter");
		      }
		
	}
}