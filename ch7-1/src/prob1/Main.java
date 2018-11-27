package prob1;

public class Main {

	public static void main(String[] args) {
		Triangle tri1 = new Triangle(5.2, 10);
		Triangle tri2 = new Triangle(1.2, 5);
		
		System.out.println("<Ã¹¹øÂ° »ï°¢Çü ³ÐÀÌ>\n" + tri1.area());
		System.out.println("<µÎ¹øÂ° »ï°¢Çü ³ÐÀÌ>\n" + tri2.area());
		
		tri1.change(1.2, 5);
		tri2.change(5.2, 10);
		
		System.out.println("\n------¼­·Î °ª ¹Ù²Þ------\n");
		System.out.println("<Ã¹¹øÂ° »ï°¢Çü ³ÐÀÌ>\n" + tri1.area());
		System.out.println("<µÎ¹øÂ° »ï°¢Çü ³ÐÀÌ>\n" + tri2.area());
	}

}
