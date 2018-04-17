package day4;

public class ArrayLab2 {

	public static void main(String[] args) {
		// 배열 선언 생성 초기
		char[] letter = { 'J', 'a', 'v', 'a', 'D', 'u', 'k', 'e' };

		// System.out.print(letter);

		for (int i = 0; i < letter.length; i++) {
			// 소문자이면
			if (letter[i] >= 97 && letter[i] <= 122) { //비교시 두개의 변수 타입이 다를때 컴파일러가 알아서 변환하여 비교한다.
			// 97, 'a', 0x61 모두 소문자 a를 지칭함
				letter[i] = (char) (letter[i] - 32);
			}
			// 대문자이면
			else if (letter[i] >= 65 && letter[i] <= 90) {
				letter[i] = (char) (letter[i] + 32);
			}
		}

		// System.out.println();
		// system.out.print 는 char형 배열은 유일하게 각 원소를 출력해준다. 다른 타입들은 모두 참조값이 출력됌

		for (int j = 0; j < letter.length; j++) {
			if (j < letter.length - 1) {
				System.out.print(letter[j] + ",");
			} else if (j == letter.length - 1) {
				System.out.print(letter[j]);
			}
		}

	}

}

/*
 * 
 * 소문자와 대문자의 아스키 코드의 차이가 32인것을 활용한다.
 * 
 * 예를 들어, A 에서 a 로 만들려면 32를 더하고 반대의 경우엔 빼면 된다.
 * 
 * 알파벳 아스키 코드는 다음과 같다. 알파벳은 총 26개 문자로 되어 있음.
 * 
 * A-65 Z-90 a-97 z-122
 * 
 * 65<= char <=90 이면 대문자, 97<= char <= 122 이면 소문자이다.
 * 
 * 또는
 * 
 * 'A'<= char <='Z' , 'a'<=char <'z'
 */