import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		PhoneBookManager manager = PhoneBookManager.createPhoneBookManager();
		int choice;
		GUI_Search_Delete src_GUI = new GUI_Search_Delete("PhoneBookVer09");
		while(true) {
			Menu.showMenu();
			try {
				choice = sc.nextInt();
				sc.nextLine();
				if(choice < startMenu.INPUT || choice > startMenu.EXIT) {
					throw new MenuChoiceException(choice);				// 선택 잘못 -- <예외>
				}
			
				switch(choice) {
				case startMenu.INPUT: 
					manager.input();
					break;
				case startMenu.CHANGE:
					manager.change();
					break;
				case startMenu.EXIT:
					manager.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
			catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
		}
	}
}

interface startMenu {
	int INPUT = 1, CHANGE = 2, EXIT = 3;
}

