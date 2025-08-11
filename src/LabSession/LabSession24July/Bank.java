package LabSession24July;
abstract class BankAccount{
	protected String Account_no;
	protected double balance;
	
public BankAccount(String Acc_no,double bal) {
	Account_no=Acc_no;
	balance=bal;
}

abstract double calculateInterest();

public void printBalance() {
    System.out.println("Account Number: " + Account_no);
    System.out.println("Current Balance: ₹" + balance);
}

}


class SavingsAccount extends BankAccount{
	private final double interestRate = 0.04; 
	public SavingsAccount(String Acc_no,double balance) {
		super(Acc_no,balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance* interestRate;
	}
	
}
class FixedAccount extends BankAccount{
	private final double interestRate = 0.065;
	public FixedAccount(String Acc_no,double balance) {
		super(Acc_no,balance);
	}
	
	@Override
	public double calculateInterest() {
		return balance* interestRate;
	}
}

public class Bank {

	public static void main(String[] args) {
	    BankAccount savings = new SavingsAccount("SBI345", 10000);
        BankAccount fixedDeposit = new FixedAccount("PNB2001", 50000);

        System.out.println("Savings Account:");
        savings.printBalance();
        System.out.println("Interest: ₹" + savings.calculateInterest());

        System.out.println();

        System.out.println("Fixed Deposit Account:");
        fixedDeposit.printBalance();
        System.out.println("Interest: ₹" + fixedDeposit.calculateInterest());

	}

}
