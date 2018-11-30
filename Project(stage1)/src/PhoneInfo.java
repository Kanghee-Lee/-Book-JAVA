
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
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("생년월일 : " + this.birthday);
	}
}
