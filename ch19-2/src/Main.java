
public class Main {

	public static void main(String[] args) {
		Business bs1 = new Business("±¸±Û", "computer science");
		PersonInfo per1 = new PersonInfo("kanghee", 23, bs1);
		PersonInfo per2;
		try {
			per2 = (PersonInfo)per1.clone();
			per1.showPersonInfo();
			per2.showPersonInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
