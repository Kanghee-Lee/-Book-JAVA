
public class PhoneInfo {
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
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
