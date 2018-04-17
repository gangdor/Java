package day6;

import java.util.Scanner;

/*사용자가 원할 때 까지, 숫자입력받고 삼각형을 출력한 후 게속할건지 물어보고
 * 1을 입력하면 계속 2를 입력하면 수행*/

public class ContinueTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final char DECO_MARK = '$';
		int num;
		int yn;
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
			
			
			a : 
			for(;;){	
			System.out.print("계속 하시려면 1, 종료하려면 2를 눌러주세요(1/2) : ");
			yn = scan.nextInt();
			if (yn == 2)
				break;
			else if (yn != 1 && yn != 2)
				System.out.println("잘못누르셨습니다.");
				continue a;
			}
		} while (yn == 1);

		scan.close();
		System.out.println("-수행종료-");
	}

}
