public class UnaryPractice
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		
/*
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(--a);
		System.out.println(--b);
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(-b);

*/
		
		// 16 - 11 = 5 + 12 = 17 + 17 = 34
		System.out.println(++b - ++a + ++a + ++b);
	}
}