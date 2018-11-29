package prob2;

public class Main {

	public static void main(String[] args) {
		String str = "990202-1101275";
		StringBuilder temp = new StringBuilder(str);
		/*int index = temp.lastIndexOf("-");	// 버퍼위에서부터 (마지막 숫자) "-" 인지 확인해가면서 맨밑 버퍼(첫번째숫자) 까지 확인한다
		System.out.println(index);
		
		if(index!=-1){
			temp.deleteCharAt(index);
		}
		
		System.out.println(str);*/          // ---------첫번째 방법---------
		
		for(int num=0; num < temp.length(); num++){
			if(temp.charAt(num)=='-'){
				temp.deleteCharAt(num);
				break;
			}
		}
		
		str=temp.toString();
		System.out.println(str);            // ---------두번째 방법---------
	}

}
