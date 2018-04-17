package day6;

import java.util.Scanner;

/*삼각형의 행의 갯수를 입력받는 부분에서 음의값이 입력되면 다시 입력받게 변경한다*/

public class ContinueTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final char DECO_MARK = '$';
		int num;
		//int yn;
		boolean check=true;
		
		do {
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num>0){
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
					}
				System.out.println();
				}
				check=false;
			}
			else{
				System.out.println("입력 오류 입니다. 다시 입력해주세요.");
				check=true;
				continue;
			}
		} while (check);
		
		scan.close();
		System.out.println("-수행종료-");
	
	}
}
