package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {

		// �������
		int[][] table = { 
				{ 10, 20, 30, 40, 50 }, 
				{ 5, 10, 15 }, 
				{ 11, 22, 33, 44 }, 
				{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }, 
				
		};

		/*int[][]table = new int[4][]; ���� �迭�� �����
		table[0] = new int[]{10,20,30,40,50}; ���� �迭�� ������ */
			
		
		
		//��  ����
		int sum[] = new int[4];

		//Ž���ϸ� �ջ�
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum[i] += table[i][j];
			}
			System.out.printf("%d���� ���� %d �Դϴ�.", i + 1, sum[i]);
			System.out.println();

		}
	}
}
