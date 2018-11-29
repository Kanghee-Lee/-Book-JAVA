package prob1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		System.out.println("���� �Է� : ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("���� ���� �Է� : ");
		int add = sc.nextInt();
		addTwoDArr(arr, add);
		
		for(int[] e : arr) {
			for(int f : e)
			System.out.print(f + " ");
		}											// 2���� �迭���� for-each�� ����!!!!!!
		
		sc.close();									// Scanner�� �ݵ�� �̷��� close()�� ��������!!
	}

	public static void addOneDArr(int[] arr, int add) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=add;
		}
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for(int i=0; i<arr.length; i++){
			addOneDArr(arr[i], add);
		}
	}												// ����Լ� �̿��ϱ�!!!!!
	
}
