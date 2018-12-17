package synchronized1;

public class AddThread extends Thread {
	IntegerGet intG;
	int sum;
	
	public AddThread(IntegerGet intG) { 
		this.intG = intG;
		sum = 0;
	}
	
	public void run() {
		for(int count = 0; count < 5; count++){
			sum += intG.getInteger();
		}
	}
	
	public void show() {
		System.out.println("5개의 정수 합 : " + sum);
	}
}
