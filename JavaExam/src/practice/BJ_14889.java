package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14889 {
	static int map[][]; // �ɷ�ġ ��
	static int N; // ���� ��
	static int teamS[];
	static int teamL[];
	static int answer = Integer.MAX_VALUE;// �ִ밪 �ֱ�

	public static void main(String[] args) throws IOException {
		// ���� �ƻ������̴�. �����ڶ� ����ϵ�
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		teamS = new int[N / 2];
		teamL = new int[N / 2];
		// map�Է�
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
		if (star==N/2 && link==N/2) { // ��������
			int powerS = 0;
			int powerL = 0;
			// �� �ɷ�ġ ���ϰ�
			for (int i = 0; i < N / 2; i++) {
				for (int j = 0; j < N / 2; j++) {
					if (i != j) {
						powerS += map[teamS[i]][teamS[j]];
						powerL += map[teamL[i]][teamL[j]];
					}
				}
			}
			int temp = Math.abs(powerS - powerL);
			// ���ؼ�
			if (temp < answer)
				answer = temp;
			// ����
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
