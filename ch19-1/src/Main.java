
public class Main {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 1, 9, 9);
		Rectangle rec2 = new Rectangle(1, 1, 9, 9);
		Rectangle rec3 = new Rectangle(1, 2, 8, 9);
		
		rec1.showPosition();
		rec2.showPosition();
		rec3.showPosition();
		
		if(rec1.equals(rec2))
			System.out.println("rec1�� rec2 �簢���� ���� �����ϴ�.");
		else
			System.out.println("rec1�� rec2 �簢���� ���� �ٸ��ϴ�.");
		
		if(rec1.equals(rec3))
			System.out.println("rec1�� rec3 �簢���� ���� �����ϴ�.");
		else
			System.out.println("rec1�� rec3 �簢���� ���� �ٸ��ϴ�.");
	}

}
