package day3;

public class ForLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = (int)(Math.random() * 8 + 3); // math.random() 함수는 0-1 미만의 실수값 랜덤 설정 
		int deco = (int)(Math.random() * 3 + 1);

		
		System.out.println("count = " + count);
		System.out.println("deco = " + deco);
		if (deco == 1) {
			for (int i = 1; i <= count; i++) {
				System.out.print('*');
			}
		}

		else if (deco == 2) {
			for (int i = 1; i <= count; i++) {
				System.out.print('$');
			}
		}

		else {
			for (int i = 1; i <= count; i++) {
				System.out.print('#');
			}
		}

	}

}
