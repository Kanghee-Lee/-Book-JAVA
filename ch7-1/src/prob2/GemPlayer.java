package prob2;

public class GemPlayer {
	int gem;
	
	public GemPlayer(int num) {
		gem=num;
	}
	
	public void winGame(GemPlayer lose, int a) {
		gem+=a;
		lose.gem-=a;
	}
	
	public void show() {
		System.out.println("보유구슬 : " + gem);
	}
}
