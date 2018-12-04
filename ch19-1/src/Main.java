
public class Main {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 1, 9, 9);
		Rectangle rec2 = new Rectangle(1, 1, 9, 9);
		Rectangle rec3 = new Rectangle(1, 2, 8, 9);
		
		rec1.showPosition();
		rec2.showPosition();
		rec3.showPosition();
		
		if(rec1.equals(rec2))
			System.out.println("rec1와 rec2 사각형의 값이 같습니다.");
		else
			System.out.println("rec1와 rec2 사각형의 값이 다릅니다.");
		
		if(rec1.equals(rec3))
			System.out.println("rec1와 rec3 사각형의 값이 같습니다.");
		else
			System.out.println("rec1와 rec3 사각형의 값이 다릅니다.");
	}

}
