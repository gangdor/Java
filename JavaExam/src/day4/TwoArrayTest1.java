package day4;

public class TwoArrayTest1 {

	public static void main(String[] args) {
		int [][]score = new int[5][3];
		System.out.println(score); // 행의 배열에 대한 참조값
		System.out.println(score[0]); //열의 배열에 대한 참조값
		System.out.println(score[0][0]); //데이터값
		
		
		System.out.println(score.length); // 행의 배열길이
		System.out.println(score[0].length); //열의 배열길이
		System.out.println(score[0][0]);

	}

}
