package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14502 {
	static int n,m;
	static int map[][]; //원본 맵
	static int map_cp[][]; //복사용 맵
	static boolean visit[][]; //방문기록
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		map= new int[n][m];
		map_cp= new int[n][m];
		visit= new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String input_line[]=br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j]=Integer.parseInt(input_line[j]);
				map_cp[i][j]=Integer.parseInt(input_line[j]);
			}
		}
		/*for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//벽세우기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map_cp[i][j]==0)
					DFS_Wall(i,j,1);
			}
			//초기화
			Init();
		}
			
			
			
		System.out.println(max);
	}
	
	//맵초기화
	public static void Init(){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map_cp[i][j]=map[i][j];
				visit[i][j]=false;
			}
		}
	}
	
	//벽 세우는 Dfs 모든 경우의 수
	public static void DFS_Wall(int x, int y, int count){
		if(visit[x][y]==true || count>3){
			return;
		}
		//벽세우기
		map_cp[x][y]=1;
		visit[x][y]=true;
		
		if(count==3){
			Active_virus();
			
			//0숫자 세기
			int temp = Safety_Zone();
			if(temp>max)
				max=temp;
			
			map_cp[x][y]=0;
			visit[x][y]=false;
			return;
		}
		else{
			for (int i = x; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(visit[i][j] || map[i][j]!=0) continue;
					DFS_Wall(i,j,count+1);
				}
			}
			//벽초기화
			map_cp[x][y]=0;
			visit[x][y]=false;
		}
	}
	public static void Active_virus(){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map_cp[i][j]==2)
					DFS_virus(i,j);
			}
		}
	}
	//바이러스 퍼뜨리는 Dfs
	public static void DFS_virus(int x, int y){
		if(map_cp[x][y]==1)
			return;
		
		map_cp[x][y]=2;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && nx<n && 0<=ny && ny<m && map_cp[nx][ny]==0)
				DFS_virus(nx, ny);
		}
		
		
		
	}
	public static int Safety_Zone(){
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(map_cp[i][j]==0)
					count++;
			}
		}
		return count;
	}
}
