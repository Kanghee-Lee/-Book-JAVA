import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintStream out = new PrintStream(new FilterOutputStream(new FileOutputStream("println.txt")));
		MyInfo mInfo = new MyInfo("���� �ڹ� ���α׷����Դϴ�.");
		out.println("�� �Ұ��� �ϰڽ��ϴ�.");
		out.println(mInfo);
		out.printf("���� %d, ������ %dkg �Դϴ�.", 24, 72);
		out.close();
	}

}
