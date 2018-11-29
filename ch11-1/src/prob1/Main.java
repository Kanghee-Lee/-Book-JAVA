package prob1;

public class Main {

	public static void main(String[] args) {
		String str = "ABCD";
		StringBuilder temp = new StringBuilder(str);
		temp.reverse();
		str = temp.toString();
		System.out.println(str);
	}

}
