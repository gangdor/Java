package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6)+5;
		int i=1;
		int j=1;
		//for��
		System.out.println("for�� ���");
		for(; i<=num; i++){
			System.out.println(i + " -> " + i*i);
		}
		
		//while��
		System.out.println("while�� ���");
		while(j<=num){
			System.out.println(j + " -> " + j*j);
			j++;
		}
		
	}

}
