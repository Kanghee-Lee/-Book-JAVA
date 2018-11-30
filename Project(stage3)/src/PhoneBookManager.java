
public class PhoneBookManager {
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	
	public void input() {
		if(frdCount==100) {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�.");
			return;
		}
		
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.print("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("������� : ");
		String birthday = Main.sc.nextLine();
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
		
		frd[frdCount] = new PhoneInfo(name, phoneNumber, birthday);
		frdCount++;
	}
	
	public void search() {
		System.out.print("�̸� : ");
		String searchName = Main.sc.nextLine();
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(searchName) == 0) {
				frd[num].showInfo();	
				System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
				return;
			}
		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
	}
	
	public void delete() {
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String deleteName = Main.sc.nextLine();
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(deleteName) == 0) {
				for(int idx = num; idx < (frdCount-1); idx++) {
					frd[idx] = frd[idx+1];
				}
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
				frdCount--;	
				return;
			}
		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
	}
}
