
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
	
	/*															// *stage9* GUI Handler �̿뿡 ���� ����
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + this.major);
		System.out.println("�г� : " + this.year);
	}
	*/
	
	public String returnInfo() {
		String info;
		info = super.returnInfo();
		info += "���� : " + this.major + "\n";
		info += "�г� : " + this.year + "\n";
		return info;
	}
}
