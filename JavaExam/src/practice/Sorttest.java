package practice;

import java.util.Scanner;

public class Sorttest {
	static char map[][] = new char[12][6];
	static boolean visit[][] = new boolean[12][6];
	static int dx[] = new int[]{1,0,-1,0};
	static int dy[] = new int[]{0,-1,0,1};
	static int baam;
	//ī��Ʈ�� �����ϴ� �迭 ������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = "";
		//�Է�
		for (int i = 0; i < 12; i++) {
			input = scan.nextLine();
			for (int j = 0; j < 6; j++) {
				map[i][j]=input.charAt(j);
			}
		}
		
		while(true){
			boolean flag = false;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if(Dfs(i,j)>=4 && map[i][j]!='.'){ //Ž���� �ҷ����Ƥ���, ī��Ʈ ��ȯ �޾ƶ�. 
						Baam();//4���� ������ �ѿ� �Ͷ߸��� ����
						flag=true;
					}
					Clear();
				}
			}
			
			if(flag){
				baam++;
				Gravity();//�ٰ��� ī��Ʈ �ϳ� �ø���, �׷���Ƽ �ҷ���
			}
			else
				break; // ������ ������ ������
		}
		
		System.out.println(baam);
		
		
		}
	
		public static int Dfs(int x, int y){
			visit[x][y]=true;
			int count=1;
			
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(0<=nx && 0<=ny && nx<12 && ny<6 && map[x][y]==map[nx][ny] && visit[x][y]==false)
					count = count + Dfs(nx,ny);
			}
			return count;
		}
		
		public static void Baam(){
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if(visit[i][j]==true)
						map[i][j]='.';
				}
			}
		}
		
		public static void Clear(){
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					visit[i][j]=false;
				}
			}
		}
		
		public static void Gravity(){
			for (int i = 0; i < 6; i++) {
				int count=0;
				for (int j = 11; j >=0; j--) {
					if(map[j][i]=='.')
						count++;
					else{
						char temp = map[j][i];
						map[j][i]='.';
						map[j+count][i]=temp;
					}
				}
			}
		}
	
	}
