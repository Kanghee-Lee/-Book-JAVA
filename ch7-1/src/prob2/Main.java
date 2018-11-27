package prob2;

public class Main {

	public static void main(String[] args) {
		GemPlayer player1 = new GemPlayer(15);
		GemPlayer player2 = new GemPlayer(9);
		
		player1.winGame(player2, 2);
		player2.winGame(player1, 7);
		
		System.out.println("plyer1ÀÇ ");
		player1.show();
		System.out.println("plyer1ÀÇ ");
		player2.show();
	}

}
