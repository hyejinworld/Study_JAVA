package exam.homework;

import java.util.Scanner;

public class Exercise07_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;

	Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택> ");
		
			String choice = sc.nextLine();

		switch (choice) {

			case "1":
				System.out.print("예금액> ");
				int deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				break;

		case "2":
		System.out.print("출금액> ");
			int withdraw = Integer.parseInt(sc.nextLine());

				if (withdraw > balance) {
			System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdraw;
				}
				break;

			case "3":
				System.out.println("잔고> " + balance);
				break;

			case "4":
				System.out.println("프로그램 종료");
		sc.close();
		System.exit(0);

			default:
				System.out.println("오류");
			}
		}
	}
}