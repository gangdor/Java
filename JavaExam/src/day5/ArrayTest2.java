package day5;

public class ArrayTest2 {

	public static void main(String[] args) {
/*		//array 선언 및 생성		
		int score[] =new int[5];
		//System.out.println(score[0]);
		score = new int[] {1,2,3,4,5};
		
		//array 초기화
		for(int j=0; j<score.length; j++){
			score[j] = j;
		}
		
		
		//array 출력
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
			
		}*/
		int score[] = new int[5];
		for(int data : score)
			System.out.print(data);
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		
		score =new int[] {100,200,300,400,500};
		for(int data : score)
			System.out.print(data);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		for(int data : score)
			System.out.print(++data);
		System.out.println(++score[0]);
		System.out.println(++score[1]);
		System.out.println(++score[2]);
		System.out.println(++score[3]);
		System.out.println(++score[4]);
	}

}
