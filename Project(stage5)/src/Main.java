import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBookManager manager = PhoneBookManager.createPhoneBookManager();
		int choice;
		
		while(true) {
			Menu.showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}

interface startMenu {
	int INPUT = 1, SEARCH = 2, DELETE = 3, EXIT = 4;
}

