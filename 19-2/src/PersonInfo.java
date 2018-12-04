
public class PersonInfo implements Cloneable {
	private String name;
	private int age;
	private Business bness;
	
	public PersonInfo(String name, int age, Business bness) {
		this.name = name;
		this.age = age;
		this.bness = bness;
	}
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bness.showBusinessInfo();
		System.out.println("");
	}
	
	public void changeWork(String work) {
		bness.changeWork(work);
	}
	
	public Object clone() throws CloneNotSupportedException {
		PersonInfo temp = (PersonInfo)super.clone();
		temp.bness = (Business)bness.clone();
		return temp;
	}
}
