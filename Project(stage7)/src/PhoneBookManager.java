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
	/*                                                      // *stage7* HashSet 이용에 의한 삭제
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	*/
	HashSet<PhoneInfo> hSet = new HashSet<PhoneInfo>(100);
	
	public void input() throws MenuChoiceException {		// 1. 데이터입력
		/*                                                  // *stage7* HashSet 이용에 의한 삭제
		if(frdCount==2) {
			System.out.println("전화번호부가 꽉 찼습니다.\n");
			return;
		}
		*/
		PhoneInfo newData = null;
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 >> ");
		int typeChoice = Main.sc.nextInt();
		Main.sc.nextLine();
		if(typeChoice < inputMenu.NORMAL || typeChoice > inputMenu.COMPANY) {
			throw new MenuChoiceException(typeChoice);				// 선택 잘못 -- <예외>
		}
		System.out.print("이름 : ");
		String name = Main.sc.nextLine();
		
		switch(typeChoice) {
		case inputMenu.NORMAL:
			newData = type1Input(name);
		//	frd[frdCount++] = type1Input();					// *stage7* HashSet 이용에 의한 삭제
			break;
		case inputMenu.UNIV:
			newData = type2Input(name);
		//  frd[frdCount++] = type2Input();					// *stage7* HashSet 이용에 의한 삭제
			break;
		case inputMenu.COMPANY:
			newData = type3Input(name);
		//	frd[frdCount++] = type3Input();					// *stage7* HashSet 이용에 의한 삭제
			break;
		}
		
		boolean isAdded = hSet.add(newData);
		if(isAdded) 
			System.out.println("데이터 입력이 완료되었습니다.\n");
		else
			System.out.println("이미 저장된 데이터입니다.\n");
	}
	
	public PhoneInfo type1Input(String name) {							// 1-1. 일반 데이터입력
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		
		return new PhoneInfo(name, phoneNumber);
	}
	
	public PhoneInfo type2Input(String name) {						// 1-2. 대학 데이터입력
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("전공 : ");
		String major = Main.sc.nextLine();
		System.out.print("학년 : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	public PhoneInfo type3Input(String name) {					// 1-3. 회사 데이터입력
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("회사 : ");
		String company = Main.sc.nextLine();
		
		
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	public void search() {									// 2. 데이터검색
		System.out.print("이름 : ");
		String searchName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		while(itr.hasNext()) {
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(searchName) == 0) {
				temp.showInfo();
				System.out.println("데이터 검색이 완료되었습니다.\n");
				return;
			}
		}
		
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		/*													// *stage7* HashSet 이용에 의한 삭제										
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(searchName) == 0) {
				frd[num].showInfo();	
				System.out.println("데이터 검색이 완료되었습니다.\n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		*/
	}
	
	public void delete() {									// 3. 데이터삭제
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		String deleteName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		
		while(itr.hasNext()){
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(deleteName) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료되었습니다.\n");
				return;
			}
		}
		
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		/*													// *stage7* HashSet 이용에 의한 삭제
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(deleteName) == 0) {
				for(int idx = num; idx < (frdCount-1); idx++) {
					frd[idx] = frd[idx+1];
				}
				System.out.println("데이터 삭제가 완료되었습니다.\n");
				frdCount--;	
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		*/
	}
	
	public void change() throws MenuChoiceException {		// 4. 데이터변경
		System.out.println("데이터 변경을 시작합니다..");
		System.out.print("이름 : ");
		String changeName = Main.sc.nextLine();
		Iterator<PhoneInfo> itr = hSet.iterator();
		
		while(itr.hasNext()) {
			PhoneInfo temp = itr.next();
			if(temp.name.compareTo(changeName) == 0) {							// 4-1. 일치하는 이름이 있다면
				System.out.println("변경을 위한 데이터 입력을 시작합니다..");	// 4-2. 데이터 분류하고
				System.out.println("1. 일반, 2. 대학, 3. 회사");
				System.out.print("선택 >> ");
				int typeChoice = Main.sc.nextInt();
				Main.sc.nextLine();
				if(typeChoice < inputMenu.NORMAL || typeChoice > inputMenu.COMPANY) {
					throw new MenuChoiceException(typeChoice);				// 선택 잘못 -- <예외>
				}
				PhoneInfo newData = null;
				itr.remove();													// 4-3. 해당데이터일단 삭제하고
				switch(typeChoice) {											// 4-4. 선택한 분류로 데이터 입력 후 저장
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
				System.out.println("데이터 변경이 완료되었습니다.\n");
				
				return;
			}
		}
		
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
	}
}


interface inputMenu {
	int NORMAL = 1, UNIV = 2, COMPANY = 3;
}
