import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ�1 �Է� : ");
		String str1 = sc.nextLine();
		System.out.print("�Ǽ�2 �Է� : ");
		String str2 = sc.nextLine();
		
		BigDecimal e1 = new BigDecimal(str1);
		BigDecimal e2 = new BigDecimal(str2);
		System.out.println("�� �Ǽ��� ���� ���밪 : " + (e1.subtract(e2)).abs());
		sc.close();
	}

}
