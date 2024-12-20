import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year;
		
		System.out.print("Enter any Year : ");
		year = input.nextInt();
		
		if(year%400==0){
		        System.out.print("LeapYear");
		    }
		else if(year%4==0 && year%100!=0){
		        System.out.print("LeapYear");
		    }
		 else{
		         System.out.print("Not LeapYear");
		     }
		
	}
}