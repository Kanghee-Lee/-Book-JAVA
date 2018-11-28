
public class Point {
	int xPos, yPos;
	
	public Point(int a, int b) {
		xPos=a;
		yPos=b;
	}
	
	public void showInfo() {
		System.out.println("[" + xPos + ", " + yPos + "]");
	}
}
