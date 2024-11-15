import java.util.Scanner;
class Bank_accnt{
	int accnt_no = 55;
	int balance = 5000;
	int interest = 5;
	void deposit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The amount you want to deposit:");
		int add_amnt = sc.nextInt();
		balance = balance + add_amnt;
		System.out.println("Current Balance:" + balance);
	}
}

class Saving_accnt extends Bank_accnt{
	int min_bal;
	void withdraw(){
		super.balance = min_bal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount To Withdraw:");
		int sub_amnt = sc.nextInt();
		min_bal -= sub_amnt;
		System.out.println("Current Balance:" + min_bal);
	}
}

class Fixed_deposit extends Saving_accnt{
	int term;
  	int bal;
	int in;
	void interest(){
		super.balance = bal;
		super.interest = in;
		int Simple_interest = (bal * term * in)/100;
		System.out.println("Simple Interest:" + Simple_interest);
	}
}

class Bank{
	public static void main(String args[])
	{
		Bank_accnt ba = new Bank_accnt();
		Saving_accnt sa = new Saving_accnt();
		Fixed_deposit fd = new Fixed_deposit();
		ba.deposit();
		sa.deposit();
		sa.withdraw();
		fd.deposit();
		fd.interest();
	}
}