package Games;

public class Game {
String Game_Name="GTA";
String Game_id="1234";
String Game_type="Action";

void Display() {
	System.out.println(Game_Name);
	System.out.println(Game_id);
	System.out.println(Game_type);
}
	public static void main(String[] args) {
		Game g = new Game();
		g.Display();

	}

}
