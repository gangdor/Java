package day6;

import day5.MethodLab3;//day5��Ű���� MethodLab3 Ŭ���� ��������.

public class MethodTest5 {

	public static void main(String[] args) {
		printNumbers(new int[0]);
		printNumbers(new int[3]);
		printNumbers(new int[] { 111, 222 });
		int[] result = getNumbers(20, 20);
		printNumbers(result);

		result = getNumbers(0, 10);
		printNumbers(result);

		// result = getNumbers(5, 5);
		printNumbers(getNumbers(10, 10));
		printNumbers(getNumbers(5, 5));
		// result = getNumbers(10, 10);
	}

	// 1���� limit �������� ������ count ������ŭ �迭�� ����
	// ���ϰ��� �迭��, �׷��� type�� int[]
	public static int[] getNumbers(int count, int limit) {

		int nums[] = new int[count];
		for (int i = 0; i < nums.length; i++)
			nums[i] = MethodLab3.getRandom(limit);// MethodLab3�� Ŭ���� �Լ� ���
		return nums;
	}

	public static void printNumbers(int nums[]) {
		if (nums.length == 0) {
			System.out.println("���Ұ� ��������!!");
			return;
		}
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
	}
}
