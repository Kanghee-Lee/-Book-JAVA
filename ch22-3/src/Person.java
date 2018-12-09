
public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "(" + age + "¼¼)";
	}
	
	public int hashCode() {
		return name.hashCode() + (age%7);
	}
	
	public boolean equals(Object obj) {
		Person temp = (Person)obj;
		if(this.name.compareTo(temp.name) == 0 && this.age == temp.age)
			return true;
		else 
			return false;
	}
}
