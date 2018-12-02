
public class PhoneCompanyInfo extends PhoneInfo {
	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ȸ�� : " + this.company);
	}
}
