/*Multi-level Inheritance
--> In java Multi-level inheritance refers to a scenario a class inherits properties and behaviour from another class, which in turn inherits from another class this creates a hierarchy of classes where each class inherits from the one about it.

class a(parent)
   |
   |
class b(child of a)
   |
   |
class c(child of b)

Syntax:-
class a{
	.
	.
	.
}
class b{
	.
	.
	.
}
class c{
	.
	.
	.
}

Demonstrate multi-level inheritance for the following:-
create a class named as animal which consists of properties and the method called as eat, create a class called as dog which inherits properties and methods form animal class. it consist a method named as bark, create another class puppy which inherits form dog class it consist a method named as weeping.create relavent objects and display the methods.*/

class Animal
{
	void eat()
	{
		System.out.println("The animal eats the animal food");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("The Dog Barks");
	}
}

class Puppy extends Dog
{
	void weeping()
	{
		System.out.println("The puppy is weeping");
	}
}

class Janvar
{
	public static void main(String args[])
	{
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weeping();
	}
}
	