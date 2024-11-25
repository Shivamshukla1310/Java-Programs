/*3. Create a class named as bank account with fields acnt_number, balance and interest_rate and a method deposit that adds an amount 
to the balance create a ssub class savings_accnt that extends bank_accnt and adds a field minimum balance and a method withdraw
 that subtracts an amount from the balance create an object of bank occount class and call deposit method, 
create an object of savings account and call the method deposit and withdraw.*/

import java.util.Scanner;
class Bank_accnt{
	int accnt_no = 55;
	int balance = 5000;
	int interest = 5;
	void deposit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The amount you want to deposit:");
		int add_amnt = sc.nextInt();
		balance = balance + add_amnt;	// this adds the amount to the actual balance
		System.out.println("Current Balance:" + balance);
	}
}

class Saving_accnt extends Bank_accnt{
	int min_bal;
	void withdraw(){
		min_bal = super.balance;		// use of the variable of the parent class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount To Withdraw:");
		int sub_amnt = sc.nextInt();    // this subtracts the amount from the actual balance
		min_bal -= sub_amnt;
		System.out.println("Current Balance:" + min_bal);
	}
}

class Fixed_deposit extends Saving_accnt{
	int term = 5;		// the year
  	int bal = super.min_bal;		// the balance
	int in = 10;			// the interest 
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