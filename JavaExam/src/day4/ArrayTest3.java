package day4;

public class ArrayTest3 {

	public static void main(String[] args) {
		// array ���� �� ����
		int score[] = new int[5];
		// System.out.println(score[0]);
		score = new int[] { 1, 2, 3, 4, 5 };
		// array �ʱ�ȭ
		for (int j = 0; j < score.length; j++) { // �迭�� �����ɶ� �ڹٴ� length��� ������ �ڵ����� �������
			score[j] = j;
		}
		// array ���
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
