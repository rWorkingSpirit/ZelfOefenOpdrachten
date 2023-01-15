import com.*;


class BaseApplication
{
	public static void main(String[] args)
	{
		CallPublic(); // Calls all the public Property, Constructor, Methods.

		// Calls the class that derives from within the same package, 
		// and calls the protected property, constructor and method.
		DerivingFromOtherClasses derFromClass = new DerivingFromOtherClasses();

		// Calls the class that derives from a different package, 
		// and calls the protected property and method.
		DeriveFromOtherPackage derFromOtherPackage = new DeriveFromOtherPackage();

		// Calls the class that derives from the same package, 
		// and calls the default property, constructor and method.
		DefaultPractice defaultPractice = new DefaultPractice();
		
	}


	static void CallPublic()
	{
		AllModifiers allMods = new AllModifiers();
		System.out.println(allMods.propertyPractice);
		allMods.PublicMethodPractice();
	}

}