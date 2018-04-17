package day5;

public class MethodLab3 {

	public static void main(String[] args) {
		int x,y;
		for (int i = 0; i < 5; i++) {
			x= getRandom(10);
			if(i==4)
			System.out.print(x);
			else
				System.out.print(x+", ");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			y= getRandom(10, 20);
			if(i==4)
			System.out.print(y);
			else
				System.out.print(y+", ");
		}
	
		
	}
	
	//1부터 n까지 난수 리턴
	public static int getRandom(int n) {
		int result = (int)(Math.random()*n)+1;
		return result;
	}
	//n1부터 n2까지 난수 리턴
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1))+n1;
		
	}
}
