package prob1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		System.out.println("정수 입력 : ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("더할 정수 입력 : ");
		int add = sc.nextInt();
		addTwoDArr(arr, add);
		
		for(int[] e : arr) {
			for(int f : e)
			System.out.print(f + " ");
		}											// 2차원 배열에서 for-each문 사용법!!!!!!
		
		sc.close();									// Scanner은 반드시 이렇게 close()로 비워줘야해!!
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
	}												// 재귀함수 이용하기!!!!!
	
}
