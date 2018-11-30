import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneInfo[] frd = new PhoneInfo[100];

		int choice;
		int frdCount = 0;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				if(frdCount==100) {
					System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�");
					break;
				}
				frd[frdCount] = read(frd[frdCount]);
				frdCount++;
				break;
			case 2:
				return;
			}
		}
	}
	
	public static PhoneInfo read(PhoneInfo t_frd) {
		
		String phoneNumber;
		String birthday;
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phoneNumber = sc.nextLine();
		System.out.print("������� : ");
		birthday = sc.nextLine();

		t_frd = new PhoneInfo(name, phoneNumber, birthday);
		System.out.println("�Էµ� ���� ���...");
		t_frd.showInfo();
		return t_frd;
	}

	public static void showMenu() {
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("���� : ");
	}
}
