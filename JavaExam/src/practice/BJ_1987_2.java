package practice;

import java.util.Scanner;

public class BJ_1987_2 {

	static int r;
	static int c;
	static int max; //�ִ밪
	static char map[][];
	static boolean visit[] = new boolean[26];
	//dfs���� ���� ���̴� ��� ��ų�� ���⼺�� ��Ÿ����
	static int nx[] = {1,0,-1,0};
	static int ny[] = {0,1,0,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt(); //��
		c = sc.nextInt(); //��
		sc.nextLine();
		map = new char[r][c];
		String x[] = new String[r];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextLine();
		}
		// 2�� �迭 �ʱ�ȭ
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
		if(visit[map[x][y]-'A'] == true) //���� ���Ǥ���
			return;
		
		visit[map[x][y]-'A'] = true;
		
		if(count>max)
			max=count;
		
		for(int i=0; i<4; i++){
			int new_x = x + nx[i];
			int new_y = y + ny[i];
            
			if(0<=new_x && new_x<r && 0<=new_y && new_y<c&&visit[map[new_x][new_y]-'A'] == false){ //����� ������ �´��� �ѹ� �� ����
				dfs(new_x,new_y,count+1);
		    }
        }

		visit[map[x][y]-'A'] = false;

		 
	}
}
