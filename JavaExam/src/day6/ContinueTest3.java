package day6;

import java.util.Scanner;

/*����ڰ� ���� �� ����, �����Է¹ް� �ﰢ���� ����� �� �Լ��Ұ��� �����
 * 1�� �Է��ϸ� ��� 2�� �Է��ϸ� ����*/

public class ContinueTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final char DECO_MARK = '$';
		int num;
		int yn;
		do {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
			
			
			a : 
			for(;;){	
			System.out.print("��� �Ͻ÷��� 1, �����Ϸ��� 2�� �����ּ���(1/2) : ");
			yn = scan.nextInt();
			if (yn == 2)
				break;
			else if (yn != 1 && yn != 2)
				System.out.println("�߸������̽��ϴ�.");
				continue a;
			}
		} while (yn == 1);

		scan.close();
		System.out.println("-��������-");
	}

}
