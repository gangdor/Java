package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {

		// 가변행렬
		int[][] table = { 
				{ 10, 20, 30, 40, 50 }, 
				{ 5, 10, 15 }, 
				{ 11, 22, 33, 44 }, 
				{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }, 
				
		};

		/*int[][]table = new int[4][]; 행의 배열을 만들고
		table[0] = new int[]{10,20,30,40,50}; 열의 배열을 만들어라 */
			
		
		
		//합  저장
		int sum[] = new int[4];

		//탐색하며 합산
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				sum[i] += table[i][j];
			}
			System.out.printf("%d행의 합은 %d 입니다.", i + 1, sum[i]);
			System.out.println();

		}
	}
}
