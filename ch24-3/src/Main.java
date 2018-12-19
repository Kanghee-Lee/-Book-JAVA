import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("printf.txt")));
		out.printf("�� ���̴� %d�� �Դϴ�.", 24);
		out.println("");
		
		out.println("���� �ڹٰ� �����ϴ�.");
		out.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		out.close();
		
		BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		String str;
		while(true) {
			str = in.readLine();
			if(str == null)
				break;
			System.out.println(str);
		}
		in.close();
	}

}
