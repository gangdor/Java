package practice;

import java.util.Scanner;

public class BJ_1987_2 {

	static int r;
	static int c;
	static int max; //최대값
	static char map[][];
	static boolean visit[] = new boolean[26];
	//dfs에서 보통 쓰이는 대박 스킬임 방향성을 나타내줌
	static int nx[] = {1,0,-1,0};
	static int ny[] = {0,1,0,-1};
	
	public static void main(String[] args) {
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
	
	public static void dfs(int x, int y, int count){
		if(visit[map[x][y]-'A'] == true) //종료 조건ㅇㅇ
			return;
		
		visit[map[x][y]-'A'] = true;
		
		if(count>max)
			max=count;
		
		for(int i=0; i<4; i++){
			int new_x = x + nx[i];
			int new_y = y + ny[i];
            
			if(0<=new_x && new_x<r && 0<=new_y && new_y<c&&visit[map[new_x][new_y]-'A'] == false){ //계산한 조건이 맞는지 한번 더 점검
				dfs(new_x,new_y,count+1);
		    }
        }

		visit[map[x][y]-'A'] = false;

		 
	}
}
