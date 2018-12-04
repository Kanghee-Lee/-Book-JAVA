
public class Point {
	int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	
	public boolean equals(Object obj) {
		Point temp = (Point)obj;
		if(this.xPos == temp.xPos && this.yPos == temp.yPos)
			return true;
		else 
			return false;
	}
}
