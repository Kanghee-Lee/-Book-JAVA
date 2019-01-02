import java.io.*;

public class PhoneInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6485601797604500872L;
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	/*															// *stage9* GUI Handler �̿뿡 ���� ����
	public void showInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
	}
	*/
	
	public String returnInfo() {
		String info;
		info = "-----" + this.name + "�� ���� �˻����-----\n";
		info += "�̸� : " + this.name + "\n";
		info += "��ȭ��ȣ : " + this.phoneNumber + "\n";
		return info;
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
	
	public boolean equals(Object obj) {
		PhoneInfo temp = (PhoneInfo)obj;
		if(this.name.compareTo(temp.name) == 0) {
			return true;
		}
		return false;
	}
}
