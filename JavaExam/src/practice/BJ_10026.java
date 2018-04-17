package practice;

import java.util.Scanner;

public class BJ_10026 {

	static int n, gooddap, baddap, count; // 1<=n<=100
	static char goodmap[][];
	static char badmap[][];
	static boolean visit[][];

	static int dX[] = { 1, 0, -1, 0 };
	static int dY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String n_string = scan.nextLine();
		n = Integer.parseInt(n_string);
		goodmap = new char[n][n];
		badmap = new char[n][n];
		visit = new boolean[n][n];
		String string = "";

		for (int i = 0; i < n; i++) {
			string = scan.next();
			for (int j = 0; j < n; j++) {
				goodmap[i][j] = string.charAt(j);
				badmap[i][j] = goodmap[i][j];
				if (badmap[i][j] == 'G')
					badmap[i][j] = 'R';
			}
		}

		gooddap = 0;
		baddap = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visit[i][j] == false) {
					System.out.println("***************************");
					Dfs(i, j);
					gooddap++;
					
					 System.out.println(i +"  "+j +"�� ���� �湮���"); for (int o =
					 0; o < n; o++) { for (int p = 0; p < n; p++) {
					 System.out.print(visit[o][p]+"  "); }
					 System.out.println(); }
					 
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				visit[i][j] = false;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visit[i][j] == false) {
					System.out.println("***************************");
					BADDfs(i, j);
					baddap++;

					
					 System.out.println(i +"  "+j +"�� ���� �湮���"); for (int o =
					 0; o < n; o++) { for (int p = 0; p < n; p++) {
					 System.out.print(visit[o][p]+"  "); }
					 System.out.println(); }
					 

				}
			}
		}

		System.out.println();
		System.out.print(gooddap + " " + baddap);
		scan.close();
	}

	public static void Dfs(int x, int y) {
		// ��������
		// System.out.println(x +" "+y +"�� �� + DFS�������");
		if (0 > x || 0 > y || x + 1 > n || y + 1 > n) { // Ż�������� x, y�� ����
			// System.out.println(x + " "+y+" DFS����");
			return; // ����
		}
		// �湮 ��尡 true�� ����
		visit[x][y] = true;

		// �ش��� ó��

		// 4���� �����
		for (int a = 0; a < 4; a++) {
			int nX = x + dX[a];
			int nY = y + dY[a];
			if (0 <= nX && 0 <= nY && nX < n && nY < n && visit[nX][nY] == false && goodmap[x][y] == goodmap[nX][nY]) {
				Dfs(nX, nY);
			}
		}
	}

	public static void BADDfs(int x, int y) {
		// ��������
		// System.out.println(x +" "+y +"�� �� + DFS�������");
		if (0 > x || 0 > y || x + 1 > n || y + 1 > n) {
			// System.out.println(x + " "+y+" DFS����");
			return; // ����
		}
		// �湮 ��尡 true�� ����
		visit[x][y] = true;
		// �ش��� ó��
		// 4���� �����
		for (int a = 0; a < 4; a++) {
			int nX = x + dX[a];
			int nY = y + dY[a];
			if (0 <= nX && 0 <= nY && nX < n && nY < n && visit[nX][nY] == false && badmap[x][y] == badmap[nX][nY]) {
				BADDfs(nX, nY);
			}
		}
	}
}
