package day3;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������");
		int num = 0;
		boolean flag = true;

		while (flag) {
			num = (int) (Math.random() * 6) + 1; // 1~6���� ����
			if (num == 3) {
				System.out.println("�����մϴ�. ��÷�Ǿ����..." + num);
				flag = false;
			} else {
				System.out.println("��Ÿ���׿�... : " + num);
			}
		}
		
		
		
		System.out.println("��������");
	}

}
