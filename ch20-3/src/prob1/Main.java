package prob1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최대값 입력 : ");
		int max = sc.nextInt();
		System.out.print("최소값 입력 : ");
		int min = sc.nextInt();
		Random rand = new Random();

		for(int num = 0; num < 10; num++)
			System.out.print(min + rand.nextInt(max-min+1) + " ");

		sc.close();
	}
}
