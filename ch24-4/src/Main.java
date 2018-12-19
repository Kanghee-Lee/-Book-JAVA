import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("data.bin", "rw");
		System.out.println("Write..............");
		System.out.printf("현재 입출력 위치 : %d 바이트\n", raf.getFilePointer());
		
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("현재 입출력 위치 : %d 바이트\n", raf.getFilePointer());
		
		raf.writeDouble(48.65);
		raf.writeDouble(52.24);
		System.out.printf("현재 입출력 위치 : %d 바이트\n", raf.getFilePointer());
		
		System.out.println("Read................");
		raf.seek(raf.length()-8);
		System.out.println(raf.readDouble());
		
	}

}
