
public class Menu {
	public static void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 변경");
		System.out.println("3. 프로그램 종료");
		System.out.print("선택 : ");
	}
}

@SuppressWarnings("serial")
class MenuChoiceException extends Exception{
	int wrongChoice;
	
	MenuChoiceException(int wrong) {
		super("잘못된 선택이 이뤄졌습니다.");
		this.wrongChoice = wrong;
	}
	
	void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다");
	}
}