import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createPhoneBookManager();
		int choice;
		
		while(true) {
			Menu.showMenu();
			try {
				choice = sc.nextInt();
				sc.nextLine();
				if(choice <startMenu.INPUT || choice >startMenu.EXIT) {
					throw new MenuChoiceException(choice);				// ���� �߸� -- <����>
				}
			
				switch(choice) {
				case startMenu.INPUT: 
					manager.input();
					break;
				case startMenu.SEARCH:
					manager.search();
					break;
				case startMenu.DELETE:
					manager.delete();
					break;
				case startMenu.EXIT:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n");
				continue;
			}
		}
	}
}

interface startMenu {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

