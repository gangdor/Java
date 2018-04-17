package day6;

import day6.MethodTest5;

public class MethodTest6 {

	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };// main method의 지역 변수
		System.out.println(ary);
		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);

	}
	
	//return을 하지 않아도 배열은 원소값을 변경할 수 있다. in-out방식
	public static void updateArray(int[] ary) {
		// ary는 parameter
		System.out.println(ary);
		for (int i = 0; i < ary.length; i++) {
			ary[i] *= 10;
		}

	}
}
