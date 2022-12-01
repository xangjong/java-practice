package ch06_class.sec09.start;

import java.util.Scanner;

import ch06_class.sec09.game.GaBaBo;
import ch06_class.sec09.game.Guess;
import ch06_class.sec09.info.AppInfo;

public class AppStart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("*******************************************");
		System.out.println("★★게임에 오신 것을 환영합니다^^");

		do {
			System.out.println("*******************************************");
			System.out.println("                   메뉴                     ");
			System.out.println("-------------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴 번호 입력 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				AppInfo info = new AppInfo();
				info.showAppInfo();
				break;
			case 2:
				GaBaBo gbb = new GaBaBo();
				gbb.play();
				break;
			case 3:
				Guess g = new Guess();
				g.play();
				break;
			case 4 : break;
			default:
				System.out.println("잘못 입력. 다시 입력 ");
			}
		} while (num != 4);

		System.out.println("*******************************************");
		System.out.println("종료합니다!");
		System.out.println("*******************************************");

		sc.close();
	}

}