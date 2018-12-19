
public class PhoneUnivInfo extends PhoneInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3274784158709566029L;
	String major;
	int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + this.major);
		System.out.println("�г� : " + this.year);
	}
}
