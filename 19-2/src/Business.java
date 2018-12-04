
public class Business implements Cloneable {
	private String company;
	private String work;
	
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	
	public void showBusinessInfo() {
		System.out.println("회사 : " + this.company);
		System.out.println("업무 : " + this.work);
	}
	
	public void changeWork(String work) {
		this.work = work;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Business temp = (Business)super.clone();
		return temp;
	}
}
