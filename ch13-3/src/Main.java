import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		
		for(int num=0; num<arr1.length; num++){
			arr1[num] = sc.nextInt();
		}
		
		System.out.println("�ּҰ� : " + minValue(arr1));
		System.out.println("�ִ밪 : " + maxValue(arr1));
		
		sc.close();
	}

	public static int minValue(int[] arr){
		int min = arr[0];
		for(int e : arr) {
			if(e < min) {
				min=e;
			}
		}
		
		return min;
	}
	
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e : arr) {
			if(e > max) {
				max=e;
			}
		}
		
		return max;
	}
	
}
