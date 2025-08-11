package LabSession25July;

public interface Accounts {
	void deposit(float d);
	void  withdraw(float w);
	void calculate_interest();
	void view_balances();
}

class Savings_Account implements Accounts{
   float interest=7.0f;
   float calculated_interest;
   float balance=0.0f;
	@Override
	public void deposit(float d) {
		balance=balance+d;
		System.out.println("The balance after depositing:"+balance);
	};
	@Override
	public void  withdraw(float w) {
		balance=balance-w;
		System.out.println("The balance after withdrawing:"+balance);
	};
	@Override
	public void calculate_interest() {
		calculated_interest=balance*interest;
		System.out.println("The calculated interest:"+ calculated_interest);
	};
	@Override
	public void view_balances() {
		System.out.println("The total_balance After Adding interest in Savings Account  is :" + (balance+calculated_interest));
	};
	
}
class Current_Account implements Accounts{
	 float interest=3.5f;
	 float calculated_interest;
	 float balance=0.0f;
	@Override
	public void deposit(float d) {
		balance=balance+d;
		System.out.println("The balance after depositing:"+balance);
	};
	@Override
	public void  withdraw(float w) {
		balance=balance-w;
		System.out.println("The balance after withdrawing:"+balance);
	};
	@Override
	public void calculate_interest() {
		calculated_interest=balance*interest;
		System.out.println("The calculated interest:"+ calculated_interest);
	};
	@Override
	public void view_balances() {
		System.out.println("The total_balance After Adding interest in Current Account  is :" + (balance+calculated_interest));
	};
}
