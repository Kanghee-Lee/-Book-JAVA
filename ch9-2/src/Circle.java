
public class Circle {
	Point p1;
	double radius;
	
	public Circle(int a, int b, double c) {
		p1 = new Point(a, b);
		radius = c;
	}
	
	public void showInfo() {
		System.out.println("radius : " + radius);
		p1.showInfo();
	}
}
