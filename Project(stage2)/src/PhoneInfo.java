
public class PhoneInfo {
	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfo(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȭ��ȣ : " + this.phoneNumber);
		System.out.println("������� : " + this.birthday);
	}
}
