package prob1;

public class Triangle {
	double length, heigth;
	
	public Triangle(double a, double b) {
		length=a;
		heigth=b;
	}
	
	public void change(double a, double b) {
		length=a;
		heigth=b;
	}
	
	public double area() {
		return length*heigth/2;
	}
}
