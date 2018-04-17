package practice;

import java.util.Scanner;

public class BJ_1986 {
	static char map[][];
	static int n,m;
	static int dx[]={-2,-1, 1, 2, 2, 1,-1,-2};
	static int dy[]={ 1, 2, 2, 1,-1,-2,-2,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		map = new char[n+1][m+1];//0d인덱스 쓰지말자, 1부터 하자
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j]='s';
			}
		}
		
		//퀸 위치 시키기
		int qnum = scan.nextInt();
		
		for (int i = 0; i < qnum; i++) {
			int qx = scan.nextInt();
			int qy = scan.nextInt();
			map[qx][qy]='Q';
		}
		
		//나이트
		int knum = scan.nextInt();
		
		for (int i = 0; i < knum; i++) {
			int kx = scan.nextInt();
			int ky = scan.nextInt();
			map[kx][ky]='K';
		}
		
		//폰
		int pnum = scan.nextInt();
		
		for (int i = 0; i < pnum; i++) {
			int px = scan.nextInt();
			int py = scan.nextInt();
			map[px][py]='P';
		}
		
		//탐색
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(map[i][j]=='Q')
					Queen(i,j);
				else if(map[i][j]=='K')
					Knight(i,j);
				
			}
		}
		
		//출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		//안전구역 세기 정답 출력
		int countS=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(map[i][j]=='s')
					countS++;
			}
		}
		System.out.println(countS);
		
	}
	public static void Queen(int x, int y){
		if(1<=x && 1<=y && x<=n && y<=m)
		{
		//가로 오른쪽
			for (int i = y+1; i <= m; i++) {
				if(map[x][i]=='s')
					map[x][i]='d';
				else if(map[x][i]=='Q' || map[x][i]=='K' || map[x][i]=='P')
					break;
			}
		//가로 왼쪽
			for (int i = y-1; i >=1; i--) {
				if(map[x][i]=='s')
					map[x][i]='d';
				else if(map[x][i]=='Q' || map[x][i]=='K' || map[x][i]=='P')
					break;
			}
		//가로끝
			
		//세로운동
		//세로운동 아래
			for (int i = x+1; i <= n; i++) {
				if(map[i][y]=='s')
					map[i][y]='d';
				else if(map[i][y]=='Q' || map[i][y]=='K' || map[i][y]=='P')
					break;
			}
		//세로운동 위
			for (int i = x-1; i >= 1; i--) {
				if(map[i][y]=='s')
					map[i][y]='d';
				else if(map[i][y]=='Q' || map[i][y]=='K' || map[i][y]=='P')
					break;
			}
		//세로운동끝
			
		// 대각선\운동
			//대각선\운동 위
			int d_lu=1;
			while(1<=x-d_lu && 1<=y-d_lu){
				if(map[x-d_lu][y-d_lu]=='s')
					map[x-d_lu][y-d_lu]='d';
				else if(map[x-d_lu][y-d_lu]=='Q' || map[x-d_lu][y-d_lu]=='K' || map[x-d_lu][y-d_lu]=='P')
						break;
				d_lu++;
			}
			
			
			//대각선\운동 아래
			int d_rd =1;
			while(x+d_rd<=n && y+d_rd<=m){
				if(map[x+d_rd][y+d_rd]=='s')
					map[x+d_rd][y+d_rd]='d';
				else if (map[x+d_rd][y+d_rd]=='Q' || map[x+d_rd][y+d_rd]=='K' || map[x+d_rd][y+d_rd]=='P')
						break;
				d_rd++;
			}
		// 대각선\운동끝
			
		// 대각선/운동
			//대각선/운동 위
			int d_ru =1;
			while(x-d_ru>=1 && y+d_ru<=m){
				if(map[x-d_ru][y+d_ru]=='s')
					map[x-d_ru][y+d_ru]='d';
				else if(map[x-d_ru][y+d_ru]=='Q' || map[x-d_ru][y+d_ru]=='K' || map[x-d_ru][y+d_ru]=='P')
						break;
				d_ru++;
			}
			//대각선/운동 아래
			int d_ld =1;
			while(x+d_ld<=n && 1<=y-d_ld){
				if(map[x+d_ld][y-d_ld]=='s')
					map[x+d_ld][y-d_ld]='d';
				else if(map[x+d_ld][y-d_ld]=='Q' || map[x+d_ld][y-d_ld]=='K' || map[x+d_ld][y-d_ld]=='P')
					break;
				d_ld++;
			}
		// 대각선/운동끝
		}

	}
	public static void Knight(int x, int y){
		
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(1<=nx && 1<=ny && nx<=n && ny<=m && map[nx][ny]=='s'){
				map[nx][ny]='d';
			}
		}
		
	}
}
