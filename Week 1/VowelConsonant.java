import java.util.Scanner;
public class VowelConsonant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char lett;
		
		System.out.print("Enter any Letter : ");
		lett = input.next().charAt(0);
		
		if(lett == 'a'){
		         System.out.println("Vowel");
		    }
	    else if(lett=='e'){
		         System.out.println("Vowel");
	         }
	     else if(lett=='i'){
	             System.out.println("Vowel");
	         }
	     else if(lett=='o'){
	             System.out.println("Vowel");
	         }
	     else if(lett=='u'){
	             System.out.println("Vowel");
	         }
	    else{
	        System.out.println("Consonant");
	        }
		
		
	}
}