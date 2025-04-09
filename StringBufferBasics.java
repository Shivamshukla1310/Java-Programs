public class StringBufferBasics
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World!");
		System.out.println("After Append: " + sb);
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());	
		System.out.println("Character at index 1: " + sb.charAt(1));
		sb.delete(5,11);
		System.out.println("After delete(5, 11)" + sb);
	}	
}