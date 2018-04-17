package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14500 {
static int n,m;
static int map[][];
static boolean visit[][];
static int dx[] = {1,0,-1,0};
static int dy[] = {0,1,0,-1};
static int max=Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		map= new int[n][m];
		visit= new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String input_line[]=br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j]=Integer.parseInt(input_line[j]);
			}
		}
		
		//�� ���
		/*for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//if(visit[i][j]==false)
					Dfs(1, 0, i, j);
			}
		}
		int result_fuck=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				//���� ���
				if(0<i && j<m-2){
					result_fuck=map[i][j]+map[i][j+1]+map[i][j+2]+map[i-1][j+1];
					if(result_fuck>max)
						max=result_fuck;
				}
								
				//���� ���
				if(i<n-1 && j<m-2){
					result_fuck=map[i][j]+map[i][j+1]+map[i][j+2]+map[i+1][j+1];
					if(result_fuck>max)
						max=result_fuck;
				}
				//���� ���
				if(i<n-2 && j<m-2){
					result_fuck=map[i][j]+map[i+1][j]+map[i+2][j]+map[i+1][j+1];
					if(result_fuck>max)
					max=result_fuck;
				}
				//���� ���
				if(i<n-2 && 0<j && j<m-2){
					result_fuck=map[i][j]+map[i+1][j]+map[i+2][j]+map[i+1][j-1];
					if(result_fuck>max)
					max=result_fuck;
				}
				
				
			}
		}
		System.out.println(max);
	}
	
	public static void Dfs(int count, int sum, int x, int y){
		//���� ����
		if(count>4)
			return;
		visit[x][y]=true;
		sum+=map[x][y];
		if(count==4 && sum>max){
			max=sum;
			return;
		}
		//����, ū �⿪, ����, ū�׸�
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && nx<n && 0<=ny && ny<m && visit[nx][ny]==false)
				Dfs(count+1, sum, nx, ny);
		}
		//��ť ���
		visit[x][y]=false;
	}
}
