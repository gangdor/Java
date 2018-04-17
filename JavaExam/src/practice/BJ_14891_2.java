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

		
		
		//���
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
			
		//�������
		int score=0;
		for(int i=0; i<4; i++){
			if(map[i][0]==1)
			score = score + (int)(Math.pow(2, i));
		}
		System.out.println(score);
		
	}

	//��� ���� �ٲٱ�
	public static int Reverse(int dir){
		return dir==1?-1:1;
	}
	
	//���
	public static void Recur(int wheel, int dir)
	{
		if(visit[wheel]==true)//Ż������
			return;
		
		visit[wheel]=true;
		
		//����Ž��
		if(0<=wheel-1 && map[wheel][6]!=map[wheel-1][2]) 
			Recur(wheel-1, Reverse(dir));
		//����Ž��
		if(wheel+1<=3 && map[wheel][2]!=map[wheel+1][6])
			Recur(wheel+1, Reverse(dir));
		
		Rotate(wheel, dir);
		
	}
	
	//������
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
			//������
			case 1:{
				int temp = map[wheel][7];
				for(int i=7; i>=1; i--){
					map[wheel][i]=map[wheel][i-1];
				}
				map[wheel][0]=temp;
				
				break;
			}
			//������
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
