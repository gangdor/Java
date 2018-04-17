package day3;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단");
		
		for (int dan =1; dan <= 9; dan++) {
			System.out.print(dan + "단 : "); //9번 수행
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan + "*" + num + "=" + dan * num + "\t"); //81번 수행
				
			}
			System.out.println();//줄 내리기
		}

	}

}
