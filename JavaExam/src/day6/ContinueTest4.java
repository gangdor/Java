package day6;

import java.util.Scanner;

/*�ﰢ���� ���� ������ �Է¹޴� �κп��� ���ǰ��� �ԷµǸ� �ٽ� �Է¹ް� �����Ѵ�*/

public class ContinueTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final char DECO_MARK = '$';
		int num;
		//int yn;
		boolean check=true;
		
		do {
			System.out.print("���ڸ� �Է��ϼ��� : ");
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
				System.out.println("�Է� ���� �Դϴ�. �ٽ� �Է����ּ���.");
				check=true;
				continue;
			}
		} while (check);
		
		scan.close();
		System.out.println("-��������-");
	
	}
}
