package prob1;

public class Main {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle(5.2, 10);
		Triangle tri2 = new Triangle(1.2, 5);
		
		System.out.println("<ù��° �ﰢ�� ����>\n" + tri1.area());
		System.out.println("<�ι�° �ﰢ�� ����>\n" + tri2.area());
		
		tri1.change(1.2, 5);
		tri2.change(5.2, 10);
		
		System.out.println("\n------���� �� �ٲ�------\n");
		System.out.println("<ù��° �ﰢ�� ����>\n" + tri1.area());
		System.out.println("<�ι�° �ﰢ�� ����>\n" + tri2.area());
	}

}
