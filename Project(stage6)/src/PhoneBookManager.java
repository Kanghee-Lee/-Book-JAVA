
public class PhoneBookManager {
	private static PhoneBookManager pbm = null;
	private PhoneBookManager() {}
	
	public static PhoneBookManager createPhoneBookManager() {
		if(pbm == null) 
			pbm = new PhoneBookManager();
		return pbm;
	}
	
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	
	public void input() throws MenuChoiceException {		// 1. �������Է�
		if(frdCount==2) {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�.\n");
			return;
		}
		
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >> ");
		int typeChoice = Main.sc.nextInt();
		Main.sc.nextLine();
		if(typeChoice < inputMenu.NORMAL || typeChoice > inputMenu.COMPANY) {
			throw new MenuChoiceException(typeChoice);				// ���� �߸� -- <����>
		}
		
		switch(typeChoice) {
		case inputMenu.NORMAL:
			frd[frdCount++] = type1Input();
			break;
		case inputMenu.UNIV:
			frd[frdCount++] = type2Input();
			break;
		case inputMenu.COMPANY:
			frd[frdCount++] = type3Input();
			break;
		}

		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
	}
	
	public PhoneInfo type1Input() {							// 1-1. �Ϲ� �������Է�
		System.out.print("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		
		return new PhoneInfo(name, phoneNumber);
	}
	
	public PhoneInfo type2Input() {						// 1-2. ���� �������Է�
		System.out.print("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("���� : ");
		String major = Main.sc.nextLine();
		System.out.print("�г� : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	public PhoneInfo type3Input() {					// 1-3. ȸ�� �������Է�
		System.out.print("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("ȸ�� : ");
		String company = Main.sc.nextLine();
		
		
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	public void search() {									// 2. �����Ͱ˻�
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
	
	public void delete() {									// 3. �����ͻ���
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


interface inputMenu {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}
