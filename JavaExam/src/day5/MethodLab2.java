package day5;

public class MethodLab2 {

	public static void main(String[] args) {
		int n1, n2, result;
		for (int i = 0; i < 5; i++) {
			n1 = (int)(Math.random()*30)+1;
			n2 = (int)(Math.random()*30)+1;
			result = doSubtraction(n1, n2);
			System.out.println(n1+"와"+n2+"의 차는" + result +"입니다.");
		}
		
		
	}
	
	public static int doSubtraction(int x, int y){
		int sub=x-y;
		//절대값 삼항연산 잘이해안감 Math.abs로 구현가능
		int result = (sub>=0)?sub:-sub;
		return result;
	}

}
