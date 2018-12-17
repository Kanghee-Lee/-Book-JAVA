package synchronized2;
import java.util.Scanner;
import java.util.concurrent.locks.*;

public class IntegerGet {
	int num;
	boolean isNum = false;
	
	private final ReentrantLock eLock = new ReentrantLock();
	private final Condition setCond = eLock.newCondition();
	private final Condition getCond = eLock.newCondition();
	
	public void setInteger() {
		Scanner sc = new Scanner(System.in);
		eLock.lock();
		try {
			if(isNum == true) 
				setCond.await();

			System.out.print("값을 입력하세요 : ");
			num = sc.nextInt();
			isNum = true;
			getCond.signal();
		}
		catch (InterruptedException e) {
			e.getMessage();
		}
		finally {
			eLock.unlock();
		}
	}
	
	public int getInteger() {
		eLock.lock();	
		try {
			if(isNum == false) 
				getCond.await();
		
			isNum = false;
			setCond.signal();
		}
		catch (InterruptedException e) {
			e.getMessage();
		}
		finally {
			eLock.unlock();
		}
		return num;
	}
}

