package practice;

import java.util.Scanner;


//up down game
public class exercise4_14 {

	public static void main(String[] args) {

		int answer = (int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		Scanner s= new Scanner(System.in);
		
		do{
			System.out.println("1-100���� ���� �Է��ϼ���.");
			count++;
			input=s.nextInt();
			
			if(input>answer)
				System.out.println("Down");
				
			else if(input<answer)
				System.out.println("UP");
				
			else if(input==answer){
				System.out.println("Damn Right");
				System.out.printf("����Ƚ���� : %d�� �Դϴ�.", count);
				break;
			}
			
				
		}while(true);
		System.out.println("��������");
		s.close();
		
	}
}
