package prob2;

public class Main {

	public static void main(String[] args) {
		int rand;
		
		for(int num = 0; num < 5; num++) {
			rand = (int)(Math.random() * 10);
			System.out.print(rand + " ");
		}
	}
}
