/*Single inheritance:-

Write java program to implement single inheritance for the following
1. create a class named as vehicle which has a method called as start that prints vehicle has started. create a sub class called as car that extends vehicle class . it has a method named as start that prints a car has started. create an object of vehicle class and call start method. create an object of car class and call start method.
2. Create a class called shape which consist of get area method that returns the area of the shape... Create a sub class called as rectangle that extends shape class and adds fields length and width it also consist of a method named as get_area that returns the area of the rectangle,Create an object of the shape class and call get_area method create an object of rectangle class and call get_area method.
3. Create a class named as bank account with fields acnt_number, balance and interest_rate and a method deposit that adds an amount to the balance create a ssub class savings_accnt that extends bank_accnt and adds a field minimum balance and a method withdraw that subtracts an amount from the balance create an object of bank occount class and call deposit method, create an object of savings account and call the method deposit and withdraw.

Multilevel inheritance:-

1. Create a class person with fields name and age and a method display that prints the name and age of a person, Create a subclass employee that extends person and adds field salary and a method display that prints the name,age, and salary of an employee,Create a sub class manager that extends employee and adds a field dept_name and a method display that prints name,age,salary and department of the manager, create an object of a person class and call display method and create an object of employee class and call display method then create manager then call display method.

Method Overriding:-

--> If the same method is defined both in super class and sub class then the method of the sub class overrides the method of the super class this is known as method overriding we use @Override annotation in the sub class written above the sub class method
--> in java annotations are the metadata that we use to provide information to the compiler here @Override Specifies the compiler that the method after this annotation overrides the method of the super class, it is not mandatory to use @Override however when we use this the method should be follow all the rules of overriding other wise the compiler will generate error

Java Overriding rules:- 
--> Both the super and sub class must have the same method name, the same return type and the same parameter list 
--> we cannot override the method declared as final and static 
--> We should always override abstract methods of the super class 

Java super keyword:-
--> The Super keyword in java is used in subclasses to access super class members(Attributes, Constructors, Methods)
Use Of Super Keyword:-
--> To call methods of the super class that is overridden in the sub class
--> To access attributes of the super class, if both super and sub class have same attributes names to explicitly call super class, no argument(Default) or parameterized Constructors form the sub class constructor

Write java program to demonstrate the use of super keyword.
--> Create a super class named as animal which consist of display method that prints i am in animal class, create a sub class named as dog which consist of method named as display that prints i am in dog class, create an object of dog class and display both i am in animal class and i am in dog class.*/

class Animal
{
	void display()
	{
		System.out.println("Me Janwar hun");
	}
}

class Dog extends Animal
{	
	@Override
	void display()
	{
		super.display();
		System.out.println("Me Kutta hun");
	}
}

class Janwar_2
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.display();
	}
}