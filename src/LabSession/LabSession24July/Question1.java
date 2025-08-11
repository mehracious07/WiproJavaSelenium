package LabSession24July;

class Payment{
	public void pay() {
		System.out.println("Being payed");
	}
}
class CreditCard extends Payment{
	@Override
	public void pay() {
		System.out.println("Being payed using credit card");
	}
}
class UPI extends Payment{
	@Override
	public void pay() {
		System.out.println("Being payed using UPI");
	}
}
class NetBanking extends Payment{
	@Override
	public void pay() {
		System.out.println("Being payed using NetBanking");
	}
}

public class Question1 {

	public static void main(String[] args) {
		NetBanking n = new NetBanking();
		UPI u = new UPI();
		CreditCard c=new CreditCard();
		u.pay();
		n.pay();
		c.pay();
	}

}
