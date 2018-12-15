
public class AdderThread extends Thread {
	int num, start, end;
	
	public AdderThread(int start, int end) {
		this.num = 0;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i = start; i < end + 1; i++) {
			num += i;
		}
	}
	
	public int getNum() {
		return num;
	}
	
}
