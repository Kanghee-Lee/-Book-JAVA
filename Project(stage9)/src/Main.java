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
					throw new MenuChoiceException(choice);				// ���� �߸� -- <����>
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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n");
			}
		}
	}
}

interface startMenu {
	int INPUT = 1, CHANGE = 2, EXIT = 3;
}
