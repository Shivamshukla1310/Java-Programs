import java.util.Stack;
public class Stack_operation
{
	public static void main(String args[])
	{
		Stack<Integer>stack = new Stack<>();
		//Push elements
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.print("\n After Pushing: " + stack);
		System.out.println("Popped: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Last: " + stack.getLast());
		stack.pop();
		stack.pop();
		System.out.println("Empty or not: " + stack.isEmpty());
	
	}
}