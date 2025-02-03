/*1. Create a class named as shape with a method calculate area that calculates and return the area of the shape create 2 subclasses rectange and traingle that extend shape class and displays area of rectangle and traingle respectively.*/

class Shape
{
	void output()
	{
		System.out.println("This is a class of Shape");
	}
}

class Rectangle extends Shape
{
	void Area_rect(int length, int breadth)
	{
		int area = length * breadth;
		System.out.println("Rectangle Area:" + area);
	}
}

class Triangle extends Shape
{
	void Area_tang(int length, int base)
	{
		float area = 0.5f * length * base;
		System.out.println("Triangle Area:" + area);
	}
}

class Hierarchical_Area
{
	public static void main(String args[])
	{
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		s.output();
		r.Area_rect(5,6);
		t.Area_tang(5,6);
	}
}