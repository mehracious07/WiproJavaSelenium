package LabSession25July;

public class Bank_Account  {

	public static void main(String[] args) {
		Savings_Account s = new Savings_Account();
		Current_Account c =  new Current_Account();
		System.out.println("For Savings Account with Intrest rate of :"+s.interest);
		 s.deposit(100);
		 s.withdraw(5);
		 s.calculate_interest();
		 s.view_balances();
		 
		 System.out.println(" ");
		 
		System.out.println("For Current Account with interest rate of :"+c.interest);
	    c.deposit(200);
	    c.withdraw(10);
	    c.calculate_interest();
		c.view_balances();

	}

}
