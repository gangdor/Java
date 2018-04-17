package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5573 {
	static int map[][];
	//static boolean visit[][];
	static int n,h,w;
	static int r_i;
	static int r_j;
	
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		h = Integer.parseInt(input1[0]);
		w = Integer.parseInt(input1[1]);
		n = Integer.parseInt(input1[2]);
		map = new int[h+1][w+1];
		//visit = new boolean[h+1][w+1];
		
		for (int i = 1; i <= h; i++) {
			String[] input2 = br.readLine().split(" ");
			for (int j = 1; j <= w; j++) {
				map[i][j]= Integer.parseInt(input2[j-1]);
			}
		}
		while(n-->0){
			Dfs(1,1);
		}
		System.out.print(r_i+" "+r_j);
		br.close();
	}
	public static void Dfs(int x, int y){
		/*if(visit[x][y]==true){
			return;
		}
		
		visit[x][y]=true;*/
		if(x==h+1 || y==w+1){
			r_i=x;
			r_j=y;
			return;
		}
		
		//오른쪽으로
		if(map[x][y]==1 && x<=h+1 && y<=w+1){
			map[x][y]=0;
			//if(visit[x][y+1]==false)
			Dfs(x,y+1);
		}
		
		//아래로
		else if(map[x][y]==0 && x<=h+1 && y<=w+1){
			map[x][y]=1;
			//if(visit[x+1][y]==false)
			Dfs(x+1,y);
		}
	}
}
