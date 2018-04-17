package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int dan = 9; 5<=dan && dan<=9; dan--) {
			System.out.print(dan + "단 : ");
			for (int i = 1; i <= 9; i++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}*/
		
		
		int dan=9;
		int i=1;
		while(5<=dan && dan<=9){
			System.out.print(dan + "단 : ");
			while(i<=9){
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
				
				i++; // 이 시점에서 i=9;
			}
			i=1;
			System.out.println();
			dan--;
		}
	}

}
