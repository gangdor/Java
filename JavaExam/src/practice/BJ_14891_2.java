package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_14891_2 {
	static int map[][];
	static boolean visit[]=new boolean[4];
	static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map = new int[4][8];
		for (int i = 0; i < 4; i++) {
			String x=br.readLine();
			for (int j = 0; j < 8; j++) {
				map[i][j]=x.charAt(j)-48;
			}
		}
		
		k=Integer.parseInt(br.readLine());
		while(k-->0){
			String a[] = br.readLine().split(" "); 
			int wheel = Integer.parseInt(a[0]);
			int dir = Integer.parseInt(a[1]);
			Recur(wheel-1,dir);
			
			for (int i = 0; i < visit.length; i++) {
				visit[i]=false;
			}
			
		}

		
		
		//Ãâ·Â
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
			
		//Á¡¼ö°è»ê
		int score=0;
		for(int i=0; i<4; i++){
			if(map[i][0]==1)
			score = score + (int)(Math.pow(2, i));
		}
		System.out.println(score);
		
	}

	//Åé´Ï ¹æÇâ ¹Ù²Ù±â
	public static int Reverse(int dir){
		return dir==1?-1:1;
	}
	
	//Àç±Í
	public static void Recur(int wheel, int dir)
	{
		if(visit[wheel]==true)//Å»ÃâÁ¶°Ç
			return;
		
		visit[wheel]=true;
		
		//ÁÂÃøÅ½»ö
		if(0<=wheel-1 && map[wheel][6]!=map[wheel-1][2]) 
			Recur(wheel-1, Reverse(dir));
		//¿ìÃøÅ½»ö
		if(wheel+1<=3 && map[wheel][2]!=map[wheel+1][6])
			Recur(wheel+1, Reverse(dir));
		
		Rotate(wheel, dir);
		
	}
	
	//±¼¸®±â
	public static void Rotate(int wheel, int dir) 
	{
		/*if(dir==1){
			int temp = map[wheel][7];
			for(int i=7; i>=1; i--){
				map[wheel][i]=map[wheel][i-1];
			}
			map[wheel][0]=temp;
		}
		else if(dir==-1){
			int temp2 = map[wheel][0];
			for (int i = 0; i < 7; i++) {
				map[wheel][i]=map[wheel][i+1];
			}
			map[wheel][7]=temp2;
		}*/
		
		switch(dir){
			//Á¤¹æÇâ
			case 1:{
				int temp = map[wheel][7];
				for(int i=7; i>=1; i--){
					map[wheel][i]=map[wheel][i-1];
				}
				map[wheel][0]=temp;
				
				break;
			}
			//¿ª¹æÇâ
			case -1:{
				int temp2 = map[wheel][0];
				for (int i = 0; i < 7; i++) {
					map[wheel][i]=map[wheel][i+1];
				}
				map[wheel][7]=temp2;
				
				break;
			}
		
		}
	}
}
