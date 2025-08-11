package LabSession24July;
abstract class Bill{
	float ElecperUnit=100;
	int WaterUnit=100;
	abstract void generateBill();	
	
}
class Electicity_Bill extends Bill{
	int unit ;
	public  Electicity_Bill(int unit) {
		this.unit=unit;
	}
	@Override
	public void generateBill() {
		System.out.println("Your bill amount is :" + unit* ElecperUnit);
	}
}
class Water_Bill extends Bill{
	int unit ;
	public  Water_Bill(int unit) {
		this.unit=unit;
	}
	@Override
	public void generateBill() {
		System.out.println("Your bill amount is :" + unit *WaterUnit );
	}
}

public class BillingSystem {

	public static void main(String[] args) {
		 Electicity_Bill e= new  Electicity_Bill(11);
		Water_Bill w=new Water_Bill(12);
		e.generateBill();
		w.generateBill();
	}

}
