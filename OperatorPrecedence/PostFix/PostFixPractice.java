public class PostFixPractice
{
	public static void main(String[] args)
	{
		
		int a = 10;
		int b = 15;
/*
		int c = a++ + b;
		System.out.println(c);
		System.out.println("a is: " + a + ", because we increased it's value after we have used it in a calculation.");

		c = a++ - b--;
		System.out.println(c);
		System.out.println("a increased again AFTER the calculation: " + a);
		System.out.println("b also increased AFTER the calculation: " + b);
*/

		a = 10;
		b = 15;
		
		// 10 + 15 - 11 + 16
		System.out.println(a++ + b++ - a-- + b--);

		a = 10;
		b = 15;

		// 15 + (10 - 10) - 12 - 14 - (15 + 15)
		// 15 + 0 - 12 - 14 - 30
		// 15 - 12 = 3 - 14 = -11 - 30 = -41
		System.out.println(b-- + (a++ - a++) - a-- - b++ - (b++ + b--));

		
	}
}