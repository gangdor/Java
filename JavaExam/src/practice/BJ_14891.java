package practice;

import java.util.Scanner;

public class BJ_14891 {

	static int map[][];
	static int check[] = new int[4];
	static int k, wheel, direc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		map = new int[4][8];
		String input;
		char[] arr;
		// 배열입력받고
		for (int i = 0; i < 4; i++) {
			input = scan.nextLine();
			arr = input.toCharArray();
			for (int j = 0; j < 8; j++) {
				map[i][j] = arr[j];
				if (map[i][j] == 48){
					map[i][j] = 0;
				}
				else if (map[i][j] == 49){
					map[i][j] = 1;
				}
			}
		}
		
		// 회전수, 바퀴와 방향 입력
		k = scan.nextInt();
		for (int i = 0; i < k; i++) {
			wheel = scan.nextInt()-1;
			direc = scan.nextInt();
			
			switch(wheel){
				case 0://0일때
				{
					check[0]=direc;
					if(map[0][2]!=map[1][6]){ //0번이랑 1번이랑 인덱스가 다르면,
						check[1]=Reverse(direc);
						if(map[1][2]!=map[2][6]){ //1번이랑 2번이랑 극이 다르면,
							check[2]=Reverse(check[1]);
							if(map[2][2]!=map[3][6]){
								check[3]=Reverse(check[2]);
							}
						}
					}
					break;
				}	
				case 1:
				{
					check[1]=direc;
					if(map[0][2]!=map[1][6]){
						check[0]=Reverse(check[1]);
					}
					if(map[1][2]!=map[2][6]){
						check[2]=Reverse(check[1]);
						if(map[2][2]!=map[3][6]){
							check[3]=Reverse(check[2]);
						}
					}
					break;
				}	
				case 2:
				{
					check[2]=direc;
					if(map[2][2]!=map[3][6])
						check[3]=Reverse(check[2]);
					if(map[2][6]!=map[1][2]){
						check[1]=Reverse(check[2]);
						if(map[1][6]!=map[0][2]){
							check[0]=Reverse(check[1]);
						}
					}
					break;
				}	
				case 3:
				{
					check[3]=direc;
					if(map[3][6]!=map[2][2]){
						check[2]=Reverse(check[3]);
						if(map[2][6]!=map[1][2]){
							check[1]=Reverse(check[2]);
							if(map[1][6]!=map[0][2]){
								check[0]=Reverse(check[1]);
								}
							}
						}
					}
					break;
				}
				
			
				Rotate(check);
				
				for (int j = 0; j < check.length; j++) {
					check[j]=0;
				}
			
			}
			
			

		// 출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		// 점수계산
		int jumsu = 0;
		if (map[0][0] == 1)
			jumsu = jumsu + 1;
		if (map[1][0] == 1)
			jumsu = jumsu + 2;
		if (map[2][0] == 1)
			jumsu = jumsu + 4;
		if (map[3][0] == 1)
			jumsu = jumsu + 8;

		System.out.println(jumsu);
		
	}
	
	public static int Reverse(int direc){
		return direc==1?-1:1;
	}
	
	
	public static void Rotate(int direc[]){
		int temp[] = new int[8];
		for (int x = 0; x < 4; x++) {
			if(direc[x]==0)
				continue;
			if(direc[x]!=0){
				if (direc[x] == 1) {
					for (int i = 0; i < 8; i++) {
						
						if (i != 0 && i != 7)
							temp[i] = map[x][i - 1];

						if (i == 7)
							temp[0] = map[x][7];

						temp[7] = map[x][6];
					}
					for (int j = 0; j < temp.length; j++) {
						map[x][j] = temp[j];
					}
				}
				
				// 역방향
				else if (direc[x] == -1) {
					for (int i = 0; i < 8; i++) {

						if (i != 0 && i != 7)
							temp[i - 1] = map[x][i];

						if (i == 7)
							temp[7] = map[x][0];

						temp[6] = map[x][7];
					}

					for (int j = 0; j < temp.length; j++) {
						map[x][j] = temp[j];
					}
				}
				
			}
		}
	}
}
	
