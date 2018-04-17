package day4;

public class ArrayTest3 {

	public static void main(String[] args) {
		// array 선언 및 생성
		int score[] = new int[5];
		// System.out.println(score[0]);
		score = new int[] { 1, 2, 3, 4, 5 };
		// array 초기화
		for (int j = 0; j < score.length; j++) { // 배열이 생성될때 자바는 length라는 변수가 자동으로 만들어짐
			score[j] = j;
		}
		// array 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
