package July25;
interface Circle{
	void C();
}
interface CalArea extends Circle{
	void Calc();
}
public class Area implements CalArea{
	@Override
public void C() {
	System.out.println("Your are inside interface Circle");
}
@Override
public void Calc() {
	System.out.println("Your are calculating Area");
}
	
	public static void main(String[] args) {
		Area a = new Area();
		a.C();
		a.Calc();
	}

}
