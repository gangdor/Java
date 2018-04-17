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
			System.out.println("1-100사이 값을 입력하세요.");
			count++;
			input=s.nextInt();
			
			if(input>answer)
				System.out.println("Down");
				
			else if(input<answer)
				System.out.println("UP");
				
			else if(input==answer){
				System.out.println("Damn Right");
				System.out.printf("수행횟수는 : %d번 입니다.", count);
				break;
			}
			
				
		}while(true);
		System.out.println("수행종료");
		s.close();
		
	}
}
