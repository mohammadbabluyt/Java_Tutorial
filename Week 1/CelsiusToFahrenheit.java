import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cels,fahr;
		
		System.out.print("Enter Celsius : ");
		cels = input.nextDouble();
		
		fahr = 1.8 * cels + 32;
		System.out.println("Celsius To Fahrenheit : "+fahr);
	}
}