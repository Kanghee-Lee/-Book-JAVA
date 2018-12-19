
public class PhoneCompanyInfo extends PhoneInfo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2101418306797596563L;
	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("È¸»ç : " + this.company);
	}
}
