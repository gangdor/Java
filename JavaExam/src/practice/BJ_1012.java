package practice;

import java.io.IOException;
import java.util.Scanner;

public class BJ_1012 {
static int test,n,m,k;
static int worm;
static int map[][][];
static boolean visitp[][][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		test=sc.nextInt();
		
		
		map = new int[test][n][m];

		
		for (int i = 0; i < test; i++) {
			m = sc.nextInt(); //ї­
			n = sc.nextInt(); //За
			k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[i][y][x]=1;
			}
		}
				
		
		for (int i = 0; i < test; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					System.out.print(map[i][j][j2]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}
	
}
