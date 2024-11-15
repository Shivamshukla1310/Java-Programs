/*Write java program to implement the following 
1. to sort numericArray in ascending and descending order 
2. to print sum of cubic values store in am array 
3. to copy the elements of 1 array into another array
4. to merge 2 array elements in the 3rd array 
5. to print unique elements from the array
6. identify even elements present in 2 different arrays create a 3rd array to store this even elements
7. find the common elements from 2 different arrays

Write Java Programs To implement hierarchical inheritance
1. Create a class named as shape with a method calculate area that calculates and return the area of the shape create 2 subclasses rectange and traingle that extend shape class and displays area of rectangle and traingle respectively.
2. Create a class named as vechile with the method drive that displays a message driving a vehicle, create 2 subclasses car and bike that extends vehicle and displays driving a car aand driving a bike respectively.

Hierarchical Inheritance:

--> When 2 or more classes inherits from the single class then it is called as hierarchical inheritance.

Syntax:-
class Parent{
----------
----------
}

class child_1 extends Parent{
-----------
----------
}

class child_2 extends Parent{
------------
----------
}*/

class Cat{
    void says(){
        System.out.println("Meow!");
    }
}
class PetCat extends Cat{// type of a cat
    void says(){
        System.out.println("Meow Meow!!");
    }
}
class MagicCat extends Cat{//another type of a cat
    boolean noOne;
    void says(){
        if(noOne){
            super.says();//use super class definition
        }else{
            System.out.println("Hi there!!");
        }
    }
}
class MULTIPLEIN{
    public static void main(String[] args) {
        PetCat c1= new PetCat();
        MagicCat c2=new MagicCat();
        c2.noOne=true;
        c2.says();
        c1.says();
        c2.noOne=false;
        c2.says();

    }
}
