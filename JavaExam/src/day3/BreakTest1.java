package day3;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������");
		
		
		abc : for (int dan =1; dan <= 9; dan++) { // abc��� �� ����
			System.out.print(dan + "�� : "); //9�� ����
			for (int num = 1; num <= 9; num++) {
				if(dan*num > 30)
					break abc; // abc���� break�ض�
				System.out.print(dan + "*" + num + "=" + dan * num + "\t"); //81�� ����
			}
			System.out.println();//�� ������
		}

	}

}
