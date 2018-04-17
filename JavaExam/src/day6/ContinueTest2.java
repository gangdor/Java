package day6;

import java.util.Scanner;

/*숫자를 입력받아 삼각형을 출력하는 기능을 3번 수행하도록*/

public class ContinueTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final char DECO_MARK = '$';

		for (int a = 0; a < 3; a++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
		}

		scan.close();
		System.out.println("-수행종료-");
	}

}
