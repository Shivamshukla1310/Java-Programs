/*Inheritance In Java
--> Inheritance is one of the key features of object oriented programming language that allows us to create a new class from ana existing class,
    the new class that is created is known as a sub class(child or derived class) and the existing class from where the child class is derived
    is known as a super class(parent or base class)...It allows a sub class to inheriet the properties and methods of the parent class.
--> The extends keyword is used to perform inheritence in java.

Need For Inheritance
--> Run time polymorphism, Runtime also known as dynamic polymorphism is a method called in the execution process that overrides a different method at the runtime
--> Code Reuseabiity:- The process of inheritance involves reusing the methods and data members, defined in the parent class, Inheritance eliminates the need to write                 
    the same code in the child class.*/




class Person{
    String name;
    int mobileno;
    void acceptdata(String name1,int mobile){
        name=name1;
        mobileno=mobile;
    }
    void displaydata(){
        System.out.println("Name= "+name+" Mobile No= "+mobileno);

    }
    
}//end of Person
class Student extends Person{
    int rollno;
    String classname;
    double percentage;
    void acceptstudent(int rno,String cl,double per){
        rollno=rno;
        classname=cl;
        percentage=per;
    }
    void display(){
        displaydata();
        System.out.println("Roll no= "+rollno+" Class Name "+classname+" Percentage= "+percentage);
    }
}//end of student


public class SingleInheritance {
    public static void main(String[] args) {
        Person p=new Person();
        Student s=new Student();
        s.acceptdata("ABC", 999);
        s.displaydata();
        s.acceptstudent(11, "FY", 90);
        s.display();
        p.acceptdata("PQR", 789);
        p.displaydata();
    }
}