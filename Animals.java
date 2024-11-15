// Write java program to demonstrate inheritance 
// Create following child classes, Dog, Cat, Goat, In the class names Dog create a method which displays the sound of dog, In the class // named cat create method which display sound of cat and in goat class create a method which dipalys the sound of the goat.
// All this three classes inherit from the class animal. In class animal create a method which stores the properties of dog,cat and // // goat. also create a method which displays that it is a animal class.

class Pets
{
	String voice;
	void dog()
	{
		voice = "Bhaw-Bhaw";
		System.out.println("--> Well Kutte Basically ese bhawkte hai:" + voice);
	}
	void cat()
	{
		voice = "Meaw-Meaw";
		System.out.println("--> Well Billiyan Basically ese bolti hai:" + voice); 
	}
	void goat()
	{
		voice = "Meh-eh-Meh";
		System.out.println("--> Well Bakariyan Basically ese bolti hai:" + voice); 
	}

}

class Dog extends Pets
{
	void puppy()
	{
		System.out.println("--> In English Dogs Babies Are Referred As Puppies ");
	}
}

class Cat extends Pets
{
	void kitten()
	{
		System.out.println("--> In English Cats Babies Are Referred As Kittens ");
	}
}

class Goat extends Pets
{
	void kid()
	{
		System.out.println("--> In English Goats Babies Are Referred As Kids ");
	}
}

class Animals
{	
	public static void main(String args[])
	{
		Dog d = new Dog();
		Cat c = new Cat();
		Goat g = new Goat();
		System.out.println("Dogs and their babies:-");
		d.dog();
		d.puppy();
		System.out.println("Cats and their babies:-");
		c.cat();
		c.kitten();
		System.out.println("Goats and their babies:-");
		g.goat();
		g.kid();
	}
}