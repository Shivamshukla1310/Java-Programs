// Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

class Question_2
{
	public static void main(String args[])
	{
		// For encryption using ascii value
		char grade = 'C';
		grade = (char)(grade + 8);
		System.out.println(grade);
		// For Decryption using ascii value
		grade = (char)(grade - 8);
		System.out.println(grade);
	}
}

