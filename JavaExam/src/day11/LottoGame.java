package day11;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
	}
}

class LottoMachine {
	private int nums[];

	public LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		System.out.print("��ȣ�� �̽��ϴ�.\t");
		Random ran = new Random(); // �ݺ����ȿ��� ���� ��ü �������� ����
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ran.nextInt(20) + 1;
		}

		/*
		 * for (int i = 0; i < nums.length; i++) { System.out.print(nums[i] +
		 * "\t"); }
		 */

	}

	public void checkLottoNums() throws DuplicateException {
		System.out.println("�ߺ��� �����մϴ�.");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					// ���� ������, ������� throws�� ����ߴ�
					throw new DuplicateException();

				}
			}
		}
		
		/*for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					// ���� ������
					throw new DuplicateException();
				}
			}
		}*/

		
		
		System.out.println("�ߺ� ���׿�.");
	}

	public int[] getNums() {
		return nums;
	}

}

public class LottoGame{

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();

		
		//try catch �� ����ó���ϸ� throw�� ���� �켱������
		try {
			lotto.createLottoNums();
			lotto.checkLottoNums();
		} catch (DuplicateException de) {
			// throw new DuplicateException();
			System.out.println(de.getMessage());
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}

		//�� �Ʒ����� try�� ������ ���� ���� �ִ�.
		int a[] = lotto.getNums();
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1)
				System.out.print(a[i]);
			else
				System.out.printf("%d,", a[i]);
		}

	}

}
