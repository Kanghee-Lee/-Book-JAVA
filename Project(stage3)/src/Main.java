import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		int choice;
		
		while(true) {
			Menu.showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				manager.input();
				break;
			case 2:
				manager.search();
				break;
			case 3:
				manager.delete();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
