package com;

public class DerivingFromOtherClasses extends AllModifiers
{

	public DerivingFromOtherClasses()
	{
		/*
		When derrived from the same package, you can use the new keyword
		to make an object of the class we derive from.
		*/
		AllModifiers allMods = new AllModifiers("Protected");
		System.out.println(allMods.protectedPractice);
		allMods.ProtectedMethodPractice();
		


	}

	
}