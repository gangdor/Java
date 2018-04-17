package day3;

public class ForLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int dan = 9; 5<=dan && dan<=9; dan--) {
			System.out.print(dan + "´Ü : ");
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}

	}

}
