/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: Defines the CheckingAccount class.
 * Due: 04/13/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Jeffrey Chu
 */

// Task #1: Extending BankAccount
public class CheckingAccount extends BankAccount {
	
	private static final double FEE = 0.15;
	
	/**
	 * CheckingAccount constructor.
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount + FEE);
	}
	
}