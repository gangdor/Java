package day11;

import java.util.Random;

class DuplicateException extends Exception {
	DuplicateException() {
		super("중복된 로또 번호가 발생했습니다.");
	}
}

class LottoMachine {
	private int nums[];

	public LottoMachine() {
		nums = new int[6];
	}

	public void createLottoNums() {
		System.out.print("번호를 뽑습니다.\t");
		Random ran = new Random(); // 반복문안에서 절대 객체 생성하지 말것
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ran.nextInt(20) + 1;
		}

		/*
		 * for (int i = 0; i < nums.length; i++) { System.out.print(nums[i] +
		 * "\t"); }
		 */

	}

	public void checkLottoNums() throws DuplicateException {
		System.out.println("중복을 점검합니다.");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					// 오류 던지기, 던질라면 throws를 해줘야댐
					throw new DuplicateException();

				}
			}
		}
		
		/*for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					// 오류 던지기
					throw new DuplicateException();
				}
			}
		}*/

		
		
		System.out.println("중복 없네요.");
	}

	public int[] getNums() {
		return nums;
	}

}

public class LottoGame{

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();

		
		//try catch 로 예외처리하면 throw절 보다 우선순위임
		try {
			lotto.createLottoNums();
			lotto.checkLottoNums();
		} catch (DuplicateException de) {
			// throw new DuplicateException();
			System.out.println(de.getMessage());
			System.out.println("프로그램을 종료합니다.");
			return;
		}

		//이 아래부터 try문 안으로 넣을 수도 있다.
		int a[] = lotto.getNums();
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1)
				System.out.print(a[i]);
			else
				System.out.printf("%d,", a[i]);
		}

	}

}
