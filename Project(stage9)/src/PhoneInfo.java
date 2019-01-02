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
	
	/*															// *stage9* GUI Handler 이용에 의한 삭제
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
	}
	*/
	
	public String returnInfo() {
		String info;
		info = "-----" + this.name + "에 대한 검색결과-----\n";
		info += "이름 : " + this.name + "\n";
		info += "전화번호 : " + this.phoneNumber + "\n";
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
