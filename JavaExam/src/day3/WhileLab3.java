package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int dan = 9; 5<=dan && dan<=9; dan--) {
			System.out.print(dan + "�� : ");
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}*/
		
		
		int dan=9;
		int i=1;
		while(5<=dan && dan<=9){
			System.out.print(dan + "�� : ");
			while(i<=9){
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
				
				i++; // �� �������� i=9;
			}
			i=1;
			System.out.println();
			dan--;
		}
	}

}
