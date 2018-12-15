
public class Main {

	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		}
		catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println(at1.getNum() + at2.getNum());
	}

}
