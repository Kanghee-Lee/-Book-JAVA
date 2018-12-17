package synchronized1;
import java.util.Scanner;

public class IntegerGet {
	int num;
	boolean isNum = false;
	
	public void setInteger() {
		Scanner sc = new Scanner(System.in);
		synchronized(this) {
			if(isNum == true) {
				try {
					wait();
				}
				catch (InterruptedException e) {
					e.getMessage();
				}
			}
			System.out.print("값을 입력하세요 : ");
			num = sc.nextInt();
			isNum = true;
			notifyAll();	
		}
	}
	
	public int getInteger() {
		synchronized(this) {
			if(isNum == false) {
				try {
						wait();
				}
				catch (InterruptedException e) {
					e.getMessage();
				}
			}
			isNum = false;
			notifyAll();
		}
			return num;
	}
}

