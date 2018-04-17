package day5;

public class MethodLab1 {

	public static void main(String[] args) {
		printChar('@', 3);
		printChar('%', 4);
		printChar('A', 5);
		printChar('°¡', 3);
		
	}

	public static void printChar(char x, int y) {
		for (int i = 1; i <= y; i++) {
			System.out.print(x);
		}
		System.out.println();
	}

}
