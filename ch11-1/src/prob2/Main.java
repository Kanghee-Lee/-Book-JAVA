package prob2;

public class Main {

	public static void main(String[] args) {
		String str = "990202-1101275";
		StringBuilder temp = new StringBuilder(str);
		/*int index = temp.lastIndexOf("-");	// �������������� (������ ����) "-" ���� Ȯ���ذ��鼭 �ǹ� ����(ù��°����) ���� Ȯ���Ѵ�
		System.out.println(index);
		
		if(index!=-1){
			temp.deleteCharAt(index);
		}
		
		System.out.println(str);*/          // ---------ù��° ���---------
		
		for(int num=0; num < temp.length(); num++){
			if(temp.charAt(num)=='-'){
				temp.deleteCharAt(num);
				break;
			}
		}
		
		str=temp.toString();
		System.out.println(str);            // ---------�ι�° ���---------
	}

}
