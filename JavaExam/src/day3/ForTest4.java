package day3;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������");
		
		for (int dan =1; dan <= 9; dan++) {
			System.out.print(dan + "�� : "); //9�� ����
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan + "*" + num + "=" + dan * num + "\t"); //81�� ����
				
			}
			System.out.println();//�� ������
		}

	}

}