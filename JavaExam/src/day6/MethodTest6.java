package day6;

import day6.MethodTest5;

public class MethodTest6 {

	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };// main method�� ���� ����
		System.out.println(ary);
		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);

	}
	
	//return�� ���� �ʾƵ� �迭�� ���Ұ��� ������ �� �ִ�. in-out���
	public static void updateArray(int[] ary) {
		// ary�� parameter
		System.out.println(ary);
		for (int i = 0; i < ary.length; i++) {
			ary[i] *= 10;
		}

	}
}
