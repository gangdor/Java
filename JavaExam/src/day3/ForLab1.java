package day3;

public class ForLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = (int)(Math.random() * 8 + 3); // math.random() �Լ��� 0-1 �̸��� �Ǽ��� ���� ���� 
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
