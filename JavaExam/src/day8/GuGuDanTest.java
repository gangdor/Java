package day8;

import day5.MethodLab3;

class GuGu {
	private int dan;
	private int number;

	GuGu() {
	}

	GuGu(int dan) {
		this.dan = dan;
	}

	GuGu(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDan extends GuGu{
	//

	GuGuDan() {

	}
	GuGuDan(int dan) {
		super(dan);
	}
	GuGuDan(int dan, int number) {
		super(dan,number);
	}
	//클래스메서드, 객체생성없이 접근ㄱㄱ
	static void printAll(){
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + "= "+(i*j) +"\t");
				
			}
			System.out.println();
		}
	}
}

public class GuGuDanTest {

	public static void main(String[] args) {
		
		int dan = MethodLab3.getRandom(20);
		int number = MethodLab3.getRandom(20);
		System.out.printf("dan : %d       number : %d%n",dan,number);
		
		if(1<=dan && dan<=9 && 1<=number && number<=9){
			GuGuDan g1 = new GuGuDan(dan,number);
			System.out.printf("%d * %d = ",dan,number);
			g1.printPart();
		}
		
		//됌
		else if(1<=dan && dan<=9 && 10<=number){
			GuGuDan g1 = new GuGuDan(dan);
			System.out.print(dan + "단 : ");
			g1.printPart();

		}
		else{
			GuGuDan.printAll();
		}
		
	}

}
