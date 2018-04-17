package practice;

import java.util.Scanner;

public class BJ_11559 {
	static char map[][] = new char[12][6];
	static int visit[][] = new int[12][6];
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
					if(Dfs(i,j)>=4){
						flag = true;
						BAAM();//뿌요를 지우는 함수 호출
						}
						Clean();
					}
					
				}
			if(flag){
				baam++;
				Gravity();
			}
			else
				break;
		}
		System.out.println(baam);
	}
	
	public  static int Dfs(int x, int y){
		if(visit[x][y]==1 || map[x][y]=='.')
			return 0;
		visit[x][y]=1;
		int count =1;
		//4방향 탐색 
		for(int i=0; i<4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(0<=nx && 0<=ny && nx<12 && ny<6 && map[nx][ny]==map[x][y] && visit[nx][ny]==0){
				//System.out.println("들어옴?");
				count = count + Dfs(nx, ny);
			}
		}
		
		return count;
	}
	
	public static void BAAM(){
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 6; j++) {
				if(visit[i][j]==1)
					map[i][j]='.';
			}
		}
	}
	
	public static void Clean(){
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 6; j++) {
				visit[i][j]=0;
			}
			
		}
	}
	
	public static void Gravity(){
		//0열
		for (int i = 0; i < 6; i++) {
			int cnt=0;
			for (int j = 11; j >= 0; j--) {
				if (map[j][i] == '.'){
					cnt++;
					
				}
				else{
					char temp = map[j][i];
					map[j][i] = '.';
					map[j+cnt][i] = temp;
				}
			}
		}
	}
	
	
	
	
}
