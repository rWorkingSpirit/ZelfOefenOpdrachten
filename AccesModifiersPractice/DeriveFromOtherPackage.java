import com.*;

public class DeriveFromOtherPackage extends AllModifiers
{

	public DeriveFromOtherPackage()
	{
		/*
		When derrived from a diferent package, you can't use the new keyword
		to make an object of the class we derive from.

		AllModifiers allMods = new AllModifiers("Protected");

		*/
		System.out.println(protectedPractice);
		ProtectedMethodPractice();

	}

	
}