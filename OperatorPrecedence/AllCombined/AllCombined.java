public class AllCombined
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;

		// 11 + 15 * 10 % 14 + 10 / 16
		//    15 * 10 = 150
		// 				10 / 16 = 0
		// 150 % 14 = 10
		// 10 + 10 = 2 + 0
		
		System.out.println(++a + ((b-- * a) % --b) + (a-- / ++b));


	}
}