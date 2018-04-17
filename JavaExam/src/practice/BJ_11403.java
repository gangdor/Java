package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_11403 {
	static int map[][]; //인접행렬
	static int visit[]; // 방문기록
	static int n; 
	static int line[][]; //간선 체크
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		map = new int[n][n];
		line = new int[n][n];
		visit = new int[n];
		//입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j]=scan.nextInt();
			}
		}
		
		//출력
		/*for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//DFS
		for (int i = 0; i < n; i++) {
			Dfs(i);
			for (int j = 0; j < n; j++) {
				line[i][j]=visit[j];
			}
			Arrays.fill(visit, 0); //초기화
		}
		

		//결과출력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(line[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void Dfs(int node){
		for (int i = 0; i < n; i++) {
			if(map[node][i]==1 && visit[i]==0){
				visit[i]=1;
				Dfs(i);
			}
				
		}
	}
}
