import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>(); 
		hSet.add(new Person("이진호", 10));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		hSet.add(new Person("김명호", 15));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		
		Iterator<Person> itr = hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
