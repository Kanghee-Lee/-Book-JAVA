package synchronized2;

public class GetThread extends Thread{
	IntegerGet intG;
	
	public GetThread(IntegerGet intG) { this.intG = intG; }
	
	public void run() {
		for(int count = 0; count < 5; count++) {
			intG.setInteger();
		}
	}
}
