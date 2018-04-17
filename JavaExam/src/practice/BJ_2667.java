package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2667 {
	static int n;
	static int danji;
	//static int count;
	static int map[][];
	static boolean visit[][];
	static int house[];
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		//n = scan.nextInt();
		n = Integer.parseInt(buffer.readLine());
		map = new int[n][n];
		visit = new boolean[n][n];
		house = new int[n * n]; // 불확실

		String x = "";
		char numx[];
		for (int i = 0; i < n; i++) {
			x = buffer.readLine();
			numx = x.toCharArray();
			for (int j = 0; j < n; j++) {
				map[i][j] = numx[j] - 48;
			}
		}

		/*for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}*/

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && visit[i][j] == false) {
					//System.out.println("***************************");
					danji++;
					Dfs(i, j);

					/*System.out.println(i + "  " + j + "일 때의 방문기록");
					for (int o = 0; o < n; o++) {
						for (int p = 0; p < n; p++) {
							System.out.print(visit[o][p] + "  ");
						}
						System.out.println();
					}*/
					//System.out.println("danji : " + danji);

				}
			}
		}

		System.out.println(danji);

		// 소팅 후
	for (int i = 0; i < house.length-1; i++) {
			for (int j = 0; j < house.length-1-i; j++) {
				if(house[j]>house[j+1]){
					int temp = house[j];
					house[j] = house[j+1];
					house[j+1] = temp;
				}
			}
		}
		
		
		
		//
		for (int i = 0; i < house.length; i++) {
			if (house[i] != 0)
				//System.out.println("house[" + i + "] : " + house[i]);
				System.out.println(house[i]);
		}

	}

	public static void Dfs(int x, int y) {
		// 종료조건
		
		if (x<0 || y<0 || x>n-1 || y>n-1) {
			System.out.println("x : " + x + " y : "+ y +" 일 때 : "+ "수행종료" );
			return;
		}
		visit[x][y] = true;
		//count++;
		/*System.out.println("***************************");
		System.out.println(x + "  " + y + "일 때의 방문기록");
		for (int o = 0; o < n; o++) {
			for (int p = 0; p < n; p++) {
				System.out.print(visit[o][p] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("x : " + x + " y : "+ y +" 일 때 : "+ count );
		System.out.println("***************************");*/
		
		house[danji]++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && 0 <= ny && nx < n && ny < n && map[nx][ny] == 1 && visit[nx][ny] == false) {
				Dfs(nx, ny);
			}
		}
		
		//

	}

}
