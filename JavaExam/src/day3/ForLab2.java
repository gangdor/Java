package day3;

public class ForLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resulteven = 1, resultodd = 1;

		for (int num = 5; num <= 20; num++) {
			if (num % 2 == 0) {
				// ¦��
				resulteven *= num; // resulteven = resulteven*num;

			} else if (num % 2 == 1) {
				// Ȧ��
				resultodd *= num;

			}

		}
		System.out.println("¦���� �� : " + resulteven);
		System.out.println("Ȧ���� �� : " + resultodd);

	}

}
