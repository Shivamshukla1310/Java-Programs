/* Write a program to implement a stack using arrays. The program should allow the user to perform the following operations dynamically at runtime:

Push: Add an element to the stack.
Pop: Remove the top element from the stack.
Peek: Display the top element of the stack.
Display: Show all elements in the stack.
Exit: Terminate the program. */

import java.util.Scanner;

public class Stack_using_array{
    private int top;
    private int max_size;
    private int[] stack_array;
    
    public Stack_using_array(int size){
        max_size = size;
        stack_array = new int[max_size];
        top = -1;
    }
    
    public void push(int value){
        if(top == max_size - 1){
            System.out.println("Stack Overflow! Cannot Push" + value);
        }
        else {
            stack_array[++top] = value;
            System.out.println(value + "Pushed to stack.");
        }
    }
    
    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow, cannott pop");
        }
        else{
            System.out.println(stack_array[top--] + "popped from stack.");
        }
    }
    
    public void peek(){
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Top element: " + stack_array[top]);
        }
    }
    
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("Stack elements: ");
            for(int i = top; i >= 0; i--){
                System.out.println(stack_array[i]);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        Stack_using_array st = new Stack_using_array(size);
        
        int choice;
        do{
            System.out.println("\n Stack Operations");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");
            System.out.println("Enter Your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = sc.nextInt();
                    st.push(value);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.display();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    break;
                default:
                    System.out.println("Invalid Input.");
            }
        }while(choice != 5);
        
    }
}