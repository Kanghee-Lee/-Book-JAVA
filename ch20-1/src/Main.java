
public class Main {

	public static void main(String[] args) {
		Integer iValue1 = Integer.valueOf(10);
		Integer iValue2 = Integer.valueOf(10);
		Integer iValue3 = Integer.valueOf(20);
		
		if(iValue1 == iValue2)
			System.out.println("iValue1�� iValue2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("iValue1�� iValue2�� �ٸ� �ν��Ͻ� ����");
		
		if(iValue1 == iValue3)
			System.out.println("iValue1�� iValue3�� ���� �ν��Ͻ� ����");
		else
			System.out.println("iValue1�� iValue3�� �ٸ� �ν��Ͻ� ����");

	}

}
