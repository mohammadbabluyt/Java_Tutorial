public class FormatSpecifiers {
	public static void main(String[] args) {
		
		boolean b = true;
		char c = 'A';
		short s = 12345;
		int i = 1234567;
		float f = 10.2f;
		double d = 10.5;
		
		System.out.printf("boolean b = %b \n",b);
		System.out.printf("char c = %c \n",c);
		System.out.printf("short s = %d \n",s);
		System.out.printf("int i = %d \n",i);
		System.out.printf("float f = %.1f \n",f);
		System.out.printf("double d =%.1f \n",d);
	}
}