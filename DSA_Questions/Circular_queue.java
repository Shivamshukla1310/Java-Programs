import java.util.Scanner;

public class Circular_queue{
    int front, rear, size;
    int[] queue;
    
    public Circular_queue(int size){
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = 0;        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println("Enqueued: " + value);
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int removed = queue[front];
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1) % size;
        }
        System.out.println("Dequeued: "  + removed);
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front Element: " + queue[front]);
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        System.out.print("Queue elements:");
        int i = front;
        while(true){
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        Circular_queue cq = new Circular_queue(size);
        
        int choice;
        do{
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit");
            System.out.println("Enter Choice:");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    cq.enqueue(value);
                    break;
                case 2:
                    cq.dequeue();
                    break;
                case 3:
                    cq.peek();
                    break;
                case 4:
                    cq.display();
                    break;
                case 5:
                    System.out.println("Exiting Program.");
                    break;
                    
                default:
                    System.out.println("Invalid Input.");
            }
        }while(choice != 5);
    }
}