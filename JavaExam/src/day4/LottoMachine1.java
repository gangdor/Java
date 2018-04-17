package day4;

public class LottoMachine1 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		lotto[0] = 19;

		// 바깥for문은 랜덤수 뽑기의 반복
		for (int i = 1; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 46) + 1;
			// 안쪽for문은 인덱스 비교의 반복
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		System.out.print("오늘의 로또 번호 - ");
		for (int i = 0; i < lotto.length; i++)
			System.out.print(lotto[i] + "\t");
	}

}

/*
 * int[] myLotto = new int[7]; myLotto[0] = 19; for(int i=1 ; i<7 ; i++) {
 * myLotto[i] = numbers[ random.nextInt(numbers.length) ]; for(int j=0 ; j<i ;
 * j++) { if( myLotto[i] == myLotto[j] ) { i--; break; } } } for(int i=0 ; i<6 ;
 * i++) { System.out.print(myLotto[i] + " "); } System.out.println( "보너스 번호: " +
 * myLotto[6] ); }
 */

/*
 * int lotto[] = new int[6]; int cnt = 0; int tmp; boolean b;
 * 
 * while (cnt < 6) { tmp = (int) (Math.random() * 45) + 1; b = false; for (int i
 * = 0; i < cnt; i++) { if (lotto[i] == tmp) { b = true; break; } } if (!b)
 * lotto[cnt++] = tmp; }
 */