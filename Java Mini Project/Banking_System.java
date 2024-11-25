/* 
Project Title: Banking System
Problem Statement:
Develop a banking system in Java that includes the following features:

A BankAccount class with fields for account number, balance, and interest rate.

Provide methods to deposit and withdraw money.
Validate withdrawal to ensure the balance does not go negative.
A subclass SavingsAccount that:

Includes an additional field for a minimum balance.
Overrides the withdrawal method to ensure the balance does not drop below the minimum balance.
A subclass FixedDepositAccount that:

Includes fields for the deposit term (years) and interest rate.
Provides a method to calculate the maturity amount using compound interest.
A BankManagement class with a main method to:

Create and manage multiple accounts.
Perform deposits, withdrawals, and interest calculations.
Allow users to choose between account types (general, savings, or fixed deposit).
Tasks to Implement:
Encapsulation:

Make fields private and provide getters and setters.
Override Methods:

Use method overriding for customized functionality like minimum balance checks in SavingsAccount.
Polymorphism:

Use a base class reference (BankAccount) to perform operations for all account types.
Interactive Menu:

Allow users to select actions (deposit, withdraw, calculate interest) dynamically.

*/