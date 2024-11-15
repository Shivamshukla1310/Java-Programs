/* Types of Inheritance
--> On the basis of class in java there are three types of inheritance
1. Single Inheritance
2. Multi-level Inheritance
3. Hierarchical Inheritance

--> In java multiple and hybrid inheritance is supported only through interfaces.

Single Inheritance
--> When one class is derived from a parent class it is called as single inheritance please note that only one class is inherited from another class.
class A(Parent)
      |
      |
      |
class A(Child)

Syntax:-
class a{
	.	
	.
	.
}
class b extends a{
	.
	.
	.
}

Demonstrate the use of sngle inheritance for the following:-
Create a class named as person which includes the fields with respect to person and a method to display its details, Create an employee class which consist of salary as a field and department name, create a method which displays employee_no, Employee_name, Salary and department_name. */

import java.util.Scanner;

class Person{
	String name;
	int age;
	String gender;
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Name:");
		name = s.nextLine();
		System.out.print("\nEnter Your Gender:");
		gender = s.nextLine();
		System.out.print("\nEnter Your age:");
		age = s.nextInt();
	}
	void display()
	{
		System.out.println("Person Details...");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
	}
}

class Employee extends Person{
	//String employee_name;
	int employee_no;
	float salary;
	String dept_name;
	void input()
	{
		super.input();
		Scanner s = new Scanner(System.in);
		System.out.print("\nEnter Your dept_Name:");
		dept_name = s.nextLine();
		System.out.print("\nEnter Your employee_no:");
		employee_no = s.nextInt();
		System.out.print("\nEnter Your salary:");
		salary = s.nextFloat();
	}
	void display()
	{
		super.display();
		System.out.println("Employee Details...");
	//	System.out.println("Name:" + name);
		System.out.println("Employee_No:" + employee_no);
		System.out.println("Department_name:" + dept_name);
		System.out.println("Salary:" + salary);

	}

}
 
class Company
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.input();
		e.display();
	}
}


// There is a problem regarding scanner class that if you take input of string after any interger or float input it will not take input better take input of all
 //	strings before interger or any other data type.