
public class Para_Method {

float pie=3.14f;
	public void  Area(int radius) {
	float Area=pie*radius*radius;
	System.out.println("Area of a circle is "+Area);
	}
	
	public static void main(String[] args) {
		
		Para_Method p= new Para_Method();
		int radius=5;
		p.Area(radius);

	}

}
