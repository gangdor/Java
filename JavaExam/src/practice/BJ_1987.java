package practice;
import java.util.Scanner;

public class BJ_1987 {
	static int r;
	static int c;
	static int max; //최대값
	static char map[][];
	static boolean visit[] = new boolean[26];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); //행
		c = sc.nextInt(); //렬
		sc.nextLine();
		map = new char[r][c];
		String x[] = new String[r];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextLine();
		}
		// 2차 배열 초기화
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				map[i][j] = x[i].charAt(j);
		}
		
		max = 0;
		dfs(0, 0, 1);

		System.out.println(max); 
		sc.close();
	}

	public static void dfs(int x, int y, int count) {
		//
		visit[map[x][y]-'A'] = true; //들어오면 남기고
		
		if(count>max)
			max = count;
		
		//R이 행. C가 열
		//위로 이동
		if(0<=x-1 && !visit[map[x-1][y]-'A'])
			dfs(x-1,y, count+1);
		//아래로
		if(x<r-1  && visit[map[x+1][y]-'A']==false)
			dfs(x+1, y, count+1);
		if(y-1>=0 && visit[map[x][y-1]-'A']==false)
			dfs(x, y-1, count+1);
		if(y<c-1 && visit[map[x][y+1]-'A']==false)
			dfs(x, y+1, count+1);
		
		visit[map[x][y]-'A'] = false; //나가면 지우고
		return ;

	}
}
