package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14889 {
	static int map[][]; // 능력치 맵
	static int N; // 선수 수
	static int teamS[];
	static int teamL[];
	static int answer = Integer.MAX_VALUE;// 최대값 넣기

	public static void main(String[] args) throws IOException {
		// 완전 탬색문제이다. 연산자랑 비슷하데
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		teamS = new int[N / 2];
		teamL = new int[N / 2];
		// map입력
		for (int i = 0; i < N; i++) {
			String[] st = br.readLine().split(" ");
			for (int j = 0; j < N; j++)
				map[i][j] = Integer.parseInt(st[j]);
		}
		Dfs(0, 0, 0);
		System.out.println(answer);
		br.close();
	}
	public static void Dfs(int star, int link, int node) {
		if (star==N/2 && link==N/2) { // 나눠지면
			int powerS = 0;
			int powerL = 0;
			// 팀 능력치 구하고
			for (int i = 0; i < N / 2; i++) {
				for (int j = 0; j < N / 2; j++) {
					if (i != j) {
						powerS += map[teamS[i]][teamS[j]];
						powerL += map[teamL[i]][teamL[j]];
					}
				}
			}
			int temp = Math.abs(powerS - powerL);
			// 비교해서
			if (temp < answer)
				answer = temp;
			// 종료
			return;
		}
		if (star < N / 2) {
			teamS[star] = node;
			Dfs(star + 1, link, node+1);
		}
		if (link < N / 2) {
			teamL[link] = node;
			Dfs(star, link + 1, node+1);
		}
	}
}
