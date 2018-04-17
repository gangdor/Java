package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_11403 {
	static int map[][]; //�������
	static int visit[]; // �湮���
	static int n; 
	static int line[][]; //���� üũ
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		map = new int[n][n];
		line = new int[n][n];
		visit = new int[n];
		//�Է�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j]=scan.nextInt();
			}
		}
		
		//���
		/*for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//DFS
		for (int i = 0; i < n; i++) {
			Dfs(i);
			for (int j = 0; j < n; j++) {
				line[i][j]=visit[j];
			}
			Arrays.fill(visit, 0); //�ʱ�ȭ
		}
		

		//������
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(line[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void Dfs(int node){
		for (int i = 0; i < n; i++) {
			if(map[node][i]==1 && visit[i]==0){
				visit[i]=1;
				Dfs(i);
			}
				
		}
	}
}
