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
		//�ϴ� B�� �� ���ǿ��� ���� C�� ������.
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]-B;
			count++;
			if(arr[i]>0){
				double namuji = (arr[i]-B)%C;
				int mok = (arr[i]-B)/C;
				//���� 0�̰�, �������� 0�� �ƴҶ�
				if(mok==0 && namuji!=0)
					count++;
				//�������� 0�ϋ�
				if(mok!=0 && namuji==0)
					count+=mok;
				//���� 0�� �ƴϰ�, �������� 0�� �ƴҶ�
				if(mok!=0 && namuji!=0)
					count+=mok+1;
			}
			
		}
		count = count + room;
		//�ΰ� �� count
		System.out.printf("%.0f",count);
		sc.close();
	}
}
