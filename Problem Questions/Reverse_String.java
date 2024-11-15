// Write Program To Reverse The String

class Reverse_String
{
	public static void main(String args[])
	{
		String Og = "Tukaram";
		String Dupli = "";
		for(int i = Og.length() - 1; i >= 0; i--)
		{
			Dupli += Og.charAt(i);
		}
		System.out.println(Og);
		System.out.println(Dupli);
	}
}