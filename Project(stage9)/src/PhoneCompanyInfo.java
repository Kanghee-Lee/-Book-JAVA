
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
	
	/*															// *stage9* GUI Handler �̿뿡 ���� ����
	public void showInfo() {
		super.showInfo();
		System.out.println("ȸ�� : " + this.company);
	}
	*/
	
	public String returnInfo() {
		String info;
		info = super.returnInfo();
		info += "ȸ�� : " + this.company + "\n";
		return info;
	}
}
