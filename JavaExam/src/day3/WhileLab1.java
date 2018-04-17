package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+5;
		int i=1;
		int j=1;
		//for문
		System.out.println("for문 결과");
		for(; i<=num; i++){
			System.out.println(i + " -> " + i*i);
		}
		
		//while문
		System.out.println("while문 결과");
		while(j<=num){
			System.out.println(j + " -> " + j*j);
			j++;
		}
		
	}

}
