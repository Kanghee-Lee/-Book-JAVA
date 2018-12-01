
public class PhoneBookManager {
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	
	public void input() {									// 1. 데이터입력
		if(frdCount==2) {
			System.out.println("전화번호부가 꽉 찼습니다.\n");
			return;
		}
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택 >> ");
		int typeChoice = Main.sc.nextInt();
		Main.sc.nextLine();
		
		switch(typeChoice) {
		case 1:
			frd[frdCount++] = type1Input();
			break;
		case 2:
			frd[frdCount++] = type2Input();
			//
			break;
		case 3:
			frd[frdCount++] = type3Input();
			//
			break;
		}

		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	
	public PhoneInfo type1Input() {							// 1-1. 일반 데이터입력
		System.out.print("이름 : ");
		String name = Main.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		
		return new PhoneInfo(name, phoneNumber);
	}
	
	public PhoneInfo type2Input() {						// 1-2. 대학 데이터입력
		System.out.print("이름 : ");
		String name = Main.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("전공 : ");
		String major = Main.sc.nextLine();
		System.out.print("학년 : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}
	
	public PhoneInfo type3Input() {					// 1-3. 회사 데이터입력
		System.out.print("이름 : ");
		String name = Main.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("회사 : ");
		String company = Main.sc.nextLine();
		
		
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}
	
	public void search() {									// 2. 데이터검색
		System.out.print("이름 : ");
		String searchName = Main.sc.nextLine();
		for(int num = 0; num < frdCount; num++) {
			if(frd[num].name.compareTo(searchName) == 0) {
				frd[num].showInfo();	
				System.out.println("데이터 검색이 완료되었습니다.\n");
				return;
			}
		}
		System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
	}
	
	public void delete() {									// 3. 데이터삭제
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름 : ");
		String deleteName = Main.sc.nextLine();
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
	}
}
