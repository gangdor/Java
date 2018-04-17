package practice;

import java.util.Scanner;

public class BJ_13458 {
	static double count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int room = sc.nextInt();
		int arr[]=new int[room];
		
		for (int i = 0; i < room; i++) {
			arr[i]=sc.nextInt();
		}
		
		int B = sc.nextInt();
		int C = sc.nextInt();
		//일단 B를 각 교실에서 빼고 C로 나눈다.
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]-B;
			count++;
			if(arr[i]>0){
				double namuji = (arr[i]-B)%C;
				int mok = (arr[i]-B)/C;
				//몫이 0이고, 나머지가 0이 아닐때
				if(mok==0 && namuji!=0)
					count++;
				//나머지가 0일떄
				if(mok!=0 && namuji==0)
					count+=mok;
				//목이 0이 아니고, 나머지가 0이 아닐때
				if(mok!=0 && namuji!=0)
					count+=mok+1;
			}
			
		}
		count = count + room;
		//부관 수 count
		System.out.printf("%.0f",count);
		sc.close();
	}
}
