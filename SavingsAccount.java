/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: Defines the SavingsAccount class.
 * Due: 04/13/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Jeffrey Chu
 */

// Task #2: Creating a Second Subclass
public class SavingsAccount extends BankAccount {
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber = super.getAccountNumber();
	
	/**
	 * SavingsAccount constructor.
	 * @param name
	 * @param amount
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = accountNumber + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.savingsNumber = oldAccount.savingsNumber + 1;
		this.accountNumber = oldAccount.accountNumber + "-" + this.savingsNumber;
	}
	
	/**
	 * postInterest method.
	 */
	public void postInterest() {
		super.deposit((rate / 12) * super.getBalance());
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
}