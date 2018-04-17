package day3;

public class ForTest5 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub System.out.println("구구단");
		 * 
		 * for (int dan =1; dan <= 9; dan++) { System.out.print(dan + "단 : ");
		 * //9번 수행 for (int num = 1; num <= 9; num++) { System.out.print(dan +
		 * "*" + num + "=" + dan * num + "\t"); //81번 수행 }
		 * System.out.println();//줄 내리기 }
		 */

		/*
		 * int count = (int)(Math.random()*7) + 1; // 랜덤함수 이용해서 1-7사이의 값 난수
		 * System.out.println("count = " + count); for(int i=1; i<=count; i++){
		 * 
		 * System.out.print('@'); }
		 */
				
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print('$'); //나란히 출력
			}
			System.out.println(); //줄띄우기
		}
		
		char munja = 'A';
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print(munja++); //나란히 출력
			}
			System.out.println(); //줄띄우기
		}
		
		munja = '가';
		for (int count = 1; count <= 5; count++) {
			for (int i = 1; i <= count; i++) {
				System.out.print(munja++); //나란히 출력
			}
			System.out.println(); //줄띄우기
		}


	}

}
