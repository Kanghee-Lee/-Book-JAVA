
public class Menu {
	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ ����");
		System.out.println("3. ���α׷� ����");
		System.out.print("���� : ");
	}
}

@SuppressWarnings("serial")
class MenuChoiceException extends Exception{
	int wrongChoice;
	
	MenuChoiceException(int wrong) {
		super("�߸��� ������ �̷������ϴ�.");
		this.wrongChoice = wrong;
	}
	
	void showWrongChoice() {
		System.out.println(wrongChoice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�");
	}
}