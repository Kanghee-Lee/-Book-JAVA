package synchronized2;

public class Main {

	public static void main(String[] args) {
		IntegerGet iG = new IntegerGet();
		GetThread gT = new GetThread(iG);
		AddThread aT = new AddThread(iG);
		
		aT.start();
		gT.start();
		
		try {
			aT.join();
			gT.join();
		}
		catch(InterruptedException e) {
			e.getMessage();
		}
		
		aT.show();
	}

}
