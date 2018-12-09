import java.util.HashSet;
import java.util.Iterator;

public class PhoneBookManager {
	private static PhoneBookManager pbm = null;
	private PhoneBookManager() {}
	
	public static PhoneBookManager createPhoneBookManager() {
		if(pbm == null) 
			pbm = new PhoneBookManager();
		return pbm;
	}
	/*                                                      // *stage7* HashSet �̿뿡 ���� ����
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	*/
	HashSet<PhoneInfo> hSet = new HashSet<PhoneInfo>(100);
	
	public void input() throws MenuChoiceException {		// 1. �������Է�
		/*                                                  // *stage7* HashSet �̿뿡 ���� ����
		if(frdCount==2) {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�.\n");
			return;
		}
		*/
		PhoneInfo newData = null;
		
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("���� >> ");
		int typeChoice = Main.sc.nextInt();
		Main.sc.nextLine();
		if(typeChoice < inputMenu.NORMAL || typeChoice > inputMenu.COMPANY) {
			throw new MenuChoiceException(typeChoice);				// ���� �߸� -- <����>
		}
		System.out.print("�̸� : ");
		String name = Main.sc.nextLine();
		
		switch(typeChoice) {
		case inputMenu.NORMAL:
			newData = type1Input(name);
		//	frd[frdCount++] = type1Input();					// *stage7* HashSet �̿뿡 ���� ����
			break;
		case inputMenu.UNIV:
			newData = type2Input(name);
		//  frd[frdCount++] = type2Input();					// *stage7* HashSet �̿뿡 ���� ����
			break;
		case inputMenu.COMPANY:
			newData = type3Input(name);
		//	frd[frdCount++] = type3Input();					// *stage7* HashSet �̿뿡 ���� ����
			break;
		}
		
		boolean isAdded = hSet.add(newData);
		if(isAdded) 
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.\n");
		else
			System.out.println("�̹� ����� �������Դϴ�.\n");
	}
	
	public PhoneInfo type1Input(String name) {							// 1-1. �Ϲ� �������Է�
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		
		return new PhoneInfo(name, phoneNumber);
	}
	
	public PhoneInfo type2Input(String name) {						// 1-2. ���� �������Է�
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("���� : ");
		String major = Main.sc.nextLine();
		System.out.print("�г� : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	public PhoneInfo type3Input(String name) {					// 1-3. ȸ�� �������Է�
		System.out.print("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("ȸ�� : ");
		String company = Main.sc.nextLine();
		
		
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	public void search() {									// 2. �����Ͱ˻�
		System.out.print("�̸� : ");
		String searchName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		while(itr.hasNext()) {
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(searchName) == 0) {
				temp.showInfo();
				System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
				return;
			}
		}
		
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
		/*													// *stage7* HashSet �̿뿡 ���� ����										
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(searchName) == 0) {
				frd[num].showInfo();	
				System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.\n");
				return;
			}
		}
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
		*/
	}
	
	public void delete() {									// 3. �����ͻ���
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String deleteName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		
		while(itr.hasNext()){
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(deleteName) == 0) {
				itr.remove();
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
				return;
			}
		}
		
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
		/*													// *stage7* HashSet �̿뿡 ���� ����
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
		*/
	}
	
	public void change() throws MenuChoiceException {		// 4. �����ͺ���
		System.out.println("������ ������ �����մϴ�..");
		System.out.print("�̸� : ");
		String changeName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(changeName) == 0) {							// 4-1. ��ġ�ϴ� �̸��� �ִٸ�
				System.out.println("������ ���� ������ �Է��� �����մϴ�..");	// 4-2. ������ �з��ϰ�
				System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
				System.out.print("���� >> ");
				int typeChoice = Main.sc.nextInt();
				Main.sc.nextLine();
				if(typeChoice < inputMenu.NORMAL || typeChoice > inputMenu.COMPANY) {
					throw new MenuChoiceException(typeChoice);				// ���� �߸� -- <����>
				}
				PhoneInfo newData = null;
				itr.remove();													// 4-3. �ش絥�����ϴ� �����ϰ�
				switch(typeChoice) {											// 4-4. ������ �з��� ������ �Է� �� ����
				case inputMenu.NORMAL:
					newData = type1Input(changeName);
					break;
				case inputMenu.UNIV:
					newData = type2Input(changeName);
					break;
				case inputMenu.COMPANY:
					newData = type3Input(changeName);
					break;
				}
				
				hSet.add(newData);
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.\n");
				
				return;
			}
		}
		
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�.\n");
	}
}


interface inputMenu {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}
