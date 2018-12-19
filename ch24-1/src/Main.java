import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		PrintStream out = new PrintStream(new FilterOutputStream(new FileOutputStream("println.txt")));
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		out.println("제 소개를 하겠습니다.");
		out.println(mInfo);
		out.printf("나이 %d, 몸무게 %dkg 입니다.", 24, 72);
		out.close();
	}

}
