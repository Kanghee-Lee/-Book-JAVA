
public class Ring {
	Circle inner, outter;
	
	public Ring(int a, int b, double r1, int c, int d, double r2) {
		inner = new Circle(a, b, r1);
		outter = new Circle(c, d, r2);
	}
	
	public void showInfo() {
		System.out.println("Inner Circle Info...");
		inner.showInfo();
		System.out.println("Outter Circle Info...");
		outter.showInfo();
	}
}
