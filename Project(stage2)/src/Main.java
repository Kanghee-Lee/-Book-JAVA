import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneInfo[] frd = new PhoneInfo[100];

		int choice;
		int frdCount = 0;
		
		while(true) {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: 
				if(frdCount==100) {
					System.out.println("전화번호부가 꽉 찼습니다");
					break;
				}
				frd[frdCount] = read(frd[frdCount]);
				frdCount++;
				break;
			case 2:
				return;
			}
		}
	}
	
	public static PhoneInfo read(PhoneInfo t_frd) {
		
		String phoneNumber;
		String birthday;
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		birthday = sc.nextLine();

		t_frd = new PhoneInfo(name, phoneNumber, birthday);
		System.out.println("입력된 정보 출력...");
		t_frd.showInfo();
		return t_frd;
	}

	public static void showMenu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
}
