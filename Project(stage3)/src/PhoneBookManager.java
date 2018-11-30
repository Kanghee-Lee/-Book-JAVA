
public class PhoneBookManager {
	PhoneInfo[] frd = new PhoneInfo[100];
	int frdCount = 0;
	
	public void input() {
		if(frdCount==100) {
			System.out.println("전화번호부가 꽉 찼습니다.");
			return;
		}
		
		System.out.println("데이터 입력을 시작합니다..");
		System.out.print("이름 : ");
		String name = Main.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.print("생년월일 : ");
		String birthday = Main.sc.nextLine();
		System.out.println("데이터 입력이 완료되었습니다.\n");
		
		frd[frdCount] = new PhoneInfo(name, phoneNumber, birthday);
		frdCount++;
	}
	
	public void search() {
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
	
	public void delete() {
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
