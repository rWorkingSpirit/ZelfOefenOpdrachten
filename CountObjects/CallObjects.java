public class CallObjects
{
	public static void main(String[] args)
	{
		CountingObjects obj1 = new CountingObjects();
		CountingObjects obj2 = new CountingObjects();
		CountingObjects obj3 = new CountingObjects();


		// creates an object, with no reference variable.
		// count will increase, because the object is created.
		new CountingObjects();

		System.out.println(CountingObjects.count);
	}
}