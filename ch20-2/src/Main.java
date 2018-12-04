import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수1 입력 : ");
		String str1 = sc.nextLine();
		System.out.print("실수2 입력 : ");
		String str2 = sc.nextLine();
		
		BigDecimal e1 = new BigDecimal(str1);
		BigDecimal e2 = new BigDecimal(str2);
		System.out.println("두 실수의 차의 절대값 : " + (e1.subtract(e2)).abs());
		sc.close();
	}

}
