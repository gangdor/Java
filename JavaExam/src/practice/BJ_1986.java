package practice;

import java.util.Scanner;

public class BJ_1986 {
	static char map[][];
	static int n,m;
	static int dx[]={-2,-1, 1, 2, 2, 1,-1,-2};
	static int dy[]={ 1, 2, 2, 1,-1,-2,-2,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		map = new char[n+1][m+1];//0d�ε��� ��������, 1���� ����
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				map[i][j]='s';
			}
		}
		
		//�� ��ġ ��Ű��
		int qnum = scan.nextInt();
		
		for (int i = 0; i < qnum; i++) {
			int qx = scan.nextInt();
			int qy = scan.nextInt();
			map[qx][qy]='Q';
		}
		
		//����Ʈ
		int knum = scan.nextInt();
		
		for (int i = 0; i < knum; i++) {
			int kx = scan.nextInt();
			int ky = scan.nextInt();
			map[kx][ky]='K';
		}
		
		//��
		int pnum = scan.nextInt();
		
		for (int i = 0; i < pnum; i++) {
			int px = scan.nextInt();
			int py = scan.nextInt();
			map[px][py]='P';
		}
		
		//Ž��
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(map[i][j]=='Q')
					Queen(i,j);
				else if(map[i][j]=='K')
					Knight(i,j);
				
			}
		}
		
		//���
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		//�������� ���� ���� ���
		int countS=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(map[i][j]=='s')
					countS++;
			}
		}
		System.out.println(countS);
		
	}
	public static void Queen(int x, int y){
		if(1<=x && 1<=y && x<=n && y<=m)
		{
		//���� ������
			for (int i = y+1; i <= m; i++) {
				if(map[x][i]=='s')
					map[x][i]='d';
				else if(map[x][i]=='Q' || map[x][i]=='K' || map[x][i]=='P')
					break;
			}
		//���� ����
			for (int i = y-1; i >=1; i--) {
				if(map[x][i]=='s')
					map[x][i]='d';
				else if(map[x][i]=='Q' || map[x][i]=='K' || map[x][i]=='P')
					break;
			}
		//���γ�
			
		//���ο
		//���ο �Ʒ�
			for (int i = x+1; i <= n; i++) {
				if(map[i][y]=='s')
					map[i][y]='d';
				else if(map[i][y]=='Q' || map[i][y]=='K' || map[i][y]=='P')
					break;
			}
		//���ο ��
			for (int i = x-1; i >= 1; i--) {
				if(map[i][y]=='s')
					map[i][y]='d';
				else if(map[i][y]=='Q' || map[i][y]=='K' || map[i][y]=='P')
					break;
			}
		//���ο��
			
		// �밢��\�
			//�밢��\� ��
			int d_lu=1;
			while(1<=x-d_lu && 1<=y-d_lu){
				if(map[x-d_lu][y-d_lu]=='s')
					map[x-d_lu][y-d_lu]='d';
				else if(map[x-d_lu][y-d_lu]=='Q' || map[x-d_lu][y-d_lu]=='K' || map[x-d_lu][y-d_lu]=='P')
						break;
				d_lu++;
			}
			
			
			//�밢��\� �Ʒ�
			int d_rd =1;
			while(x+d_rd<=n && y+d_rd<=m){
				if(map[x+d_rd][y+d_rd]=='s')
					map[x+d_rd][y+d_rd]='d';
				else if (map[x+d_rd][y+d_rd]=='Q' || map[x+d_rd][y+d_rd]=='K' || map[x+d_rd][y+d_rd]=='P')
						break;
				d_rd++;
			}
		// �밢��\���
			
		// �밢��/�
			//�밢��/� ��
			int d_ru =1;
			while(x-d_ru>=1 && y+d_ru<=m){
				if(map[x-d_ru][y+d_ru]=='s')
					map[x-d_ru][y+d_ru]='d';
				else if(map[x-d_ru][y+d_ru]=='Q' || map[x-d_ru][y+d_ru]=='K' || map[x-d_ru][y+d_ru]=='P')
						break;
				d_ru++;
			}
			//�밢��/� �Ʒ�
			int d_ld =1;
			while(x+d_ld<=n && 1<=y-d_ld){
				if(map[x+d_ld][y-d_ld]=='s')
					map[x+d_ld][y-d_ld]='d';
				else if(map[x+d_ld][y-d_ld]=='Q' || map[x+d_ld][y-d_ld]=='K' || map[x+d_ld][y-d_ld]=='P')
					break;
				d_ld++;
			}
		// �밢��/���
		}

	}
	public static void Knight(int x, int y){
		
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(1<=nx && 1<=ny && nx<=n && ny<=m && map[nx][ny]=='s'){
				map[nx][ny]='d';
			}
		}
		
	}
}
