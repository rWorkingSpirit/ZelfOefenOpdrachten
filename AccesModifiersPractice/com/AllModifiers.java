package com;

public class AllModifiers // public class can be accessed by everyone.
{
	{ PrivateMethodPractice(); }


	public String propertyPractice = "public property.";
	protected String protectedPractice = "protected property";
	String defaultPractice = "default property";
	private String privatePractice;
	

	public AllModifiers()
	{
		System.out.println("This is a PUBLIC CONSTRUCTOR and can be accessed by everyone.");
	}

	protected AllModifiers(String pro)
	{
		//protected = proteced;
		System.out.println("This is a PROTECTED CONSTRUCTOR and can be accessed from the same package and by derrived classes from a sepperate package.");
	}

	AllModifiers(String a, String b)
	{
		System.out.println("Default CONSTRUCTOR is only accessible in the same package");
	}

	public void PublicMethodPractice()
	{
		System.out.println("This is a public METHOD and can be accessed by everyone.");
	}

	protected void ProtectedMethodPractice()
	{
		System.out.println("This is a PROTECTED METHOD and can be accessed from the same package and by derrived classes from a sepperate package..");
	}

	void AllModifiers()
	{
		System.out.println("Default METHOD is only accessible in the same package");
	}

	private void PrivateMethodPractice()
	{
		privatePractice = "private property";
		System.out.println(privatePractice);
		System.out.println("Private METHOD is only accessible in the class in which it's defined");
	}
}