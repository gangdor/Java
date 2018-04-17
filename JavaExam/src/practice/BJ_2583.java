package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2583 {
	static int map[][];
	static boolean visit[][];
	static int k,m,n;
	static int[] size;
	static int count;
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		map = new int[m][n];
		visit = new boolean[m][n];
		size = new int[m*n];
		k= sc.nextInt();
		//Ä¥ÇÏ±â
		
		int xb;
		int yb;
		int xt;
		int yt;
		while(k-->0){
			xb = sc.nextInt();
			yb = sc.nextInt();
			xt = sc.nextInt();
			yt = sc.nextInt();
			
			for (int j = xb; j < xt; j++) {
				for (int i = yb; i < yt; i++) {
					map[i][j]=1;
				}
			}
		}
		
		//
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(map[i][j]==0 && visit[i][j]==false){
					Dfs(i,j);
					count++;
				}
			}
		}
		
		System.out.println(count);
		Arrays.sort(size);
		for (int i = 0; i < size.length; i++) {
			if(size[i]!=0)
				System.out.print(size[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
	public static void Dfs(int x, int y){
		if(visit[x][y]==true)
			return;
		
		visit[x][y]=true;
		size[count]++;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && 0<=ny && nx<m && ny<n && map[nx][ny]==0)
				Dfs(nx,ny);
		}
	}
}
