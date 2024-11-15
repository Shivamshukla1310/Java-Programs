// 3.Write java program to create a method that takes a string as an input and throws an exception if the string does not contain vowels

import java.lang.*;

class Vowels_Exception
{
	public static void main(String args[])
	{

	}

	public void Vowel(char s)
	{
		if(s != 'A' && s != 'a' && s != 'E' && s != 'e' && s != 'I' && s != 'i' && s != 'O' && s != 'o' && s != 'U' && s != 'u')
		{
			
		}
	}
}



/*import java.util.*;
import java.lang.*;

class VowelExceptionInvalid extends Exception
{
	VowelExceptionInvalid(String message)
	{
		super(message);
	}
}
class Vowels_Exception
{	
	public static void main(String args[])
	{
		Vowels_Exception check = new Vowels_Exception();
		try
		{	
			check.Vowel('R');
		}
		catch(VowelExceptionInvalid e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void Vowel(char s)
	{
		if(s != 'A' && s != 'a' && s != 'E' && s != 'e' && s != 'I' && s != 'i' && s != 'O' && s != 'o' && s != 'U' && s != 'u')
		{
			//try
			//{
				throw new VowelExceptionInvalid("Input Is Wrong It IS Not Vowel");
			//}
			catch(VowelExceptionInvalid e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.print("\n It Is Vowel");
		}
	}
}
*/

