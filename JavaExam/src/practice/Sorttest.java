package practice;

import java.util.Scanner;

public class Sorttest {
	static char map[][] = new char[12][6];
	static boolean visit[][] = new boolean[12][6];
	static int dx[] = new int[]{1,0,-1,0};
	static int dy[] = new int[]{0,-1,0,1};
	static int baam;
	//카운트를 저장하는 배열 ㄱㄱㄱ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = "";
		//입력
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
					if(Dfs(i,j)>=4 && map[i][j]!='.'){ //탐색을 불러르아ㅏㅏ, 카운트 반환 받아라. 
						Baam();//4보다 높으면 뿌요 터뜨리기 시전
						flag=true;
					}
					Clear();
				}
			}
			
			if(flag){
				baam++;
				Gravity();//다같이 카운트 하나 올리고, 그래비티 불러라
			}
			else
				break; // 터질게 없으면 나가라
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
