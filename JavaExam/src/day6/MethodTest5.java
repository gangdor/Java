package day6;

import day5.MethodLab3;//day5패키지의 MethodLab3 클래스 데려와줘.

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

	// 1부터 limit 값까지의 난수를 count 갯수만큼 배열로 리턴
	// 리턴값이 배열임, 그래서 type이 int[]
	public static int[] getNumbers(int count, int limit) {

		int nums[] = new int[count];
		for (int i = 0; i < nums.length; i++)
			nums[i] = MethodLab3.getRandom(limit);// MethodLab3의 클래스 함수 사용
		return nums;
	}

	public static void printNumbers(int nums[]) {
		if (nums.length == 0) {
			System.out.println("원소가 없구만요!!");
			return;
		}
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
	}
}
