package day3;

public class ForTest5 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub System.out.println("������");
		 * 
		 * for (int dan =1; dan <= 9; dan++) { System.out.print(dan + "�� : ");
		 * //9�� ���� for (int num = 1; num <= 9; num++) { System.out.print(dan +
		 * "*" + num + "=" + dan * num + "\t"); //81�� ���� }
		 * System.out.println();//�� ������ }
		 */

		/*
		 * int count = (int)(Math.random()*7) + 1; // �����Լ� �̿��ؼ� 1-7������ �� ����
		 * System.out.println("count = " + count); for(int i=1; i<=count; i++){
		 * 
		 * System.out.print('@'); }
		 */
				
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print('$'); //������ ���
			}
			System.out.println(); //�ٶ���
		}
		
		char munja = 'A';
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print(munja++); //������ ���
			}
			System.out.println(); //�ٶ���
		}
		
		munja = '��';
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print(munja++); //������ ���
			}
			System.out.println(); //�ٶ���
		}


	}

}
