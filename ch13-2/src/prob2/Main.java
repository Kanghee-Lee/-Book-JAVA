package prob2;

public class Main {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		arr = changeArr(arr);
		System.out.println("<첫번째 이동>");
		showTwoDArr(arr);
		
		arr = changeArr(arr);
		System.out.println("<두번째 이동>");
		showTwoDArr(arr); 
	}

	public static int[][] changeArr(int[][] arr) {
		int[] temp = arr[arr.length-1];

		for(int i=arr.length-1; i>0; i--) {				
			arr[i] = arr[i-1];
		}
		
		arr[0] = temp;
		return arr;
	}
	
	
	public static void showTwoDArr(int[][] arr){
		for(int[] e : arr) {
			for(int f : e) {
				System.out.print(f + " ");
			}
			System.out.println("");
		}
	}
}
