package day14;
public class IntegerTest {
	public static void main(String[] args) {
		String s1 = Integer.toBinaryString(12);//정수를 이진수로
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1+8);
		System.out.printf("%s\n", s2+8);
		
		int num1 = Integer.parseInt(s1 ,2);//2진수인 수를 정수로 바꾸라
		int num2 = Integer.parseInt(s2, 2);
		
		/*int num1 = Integer.parseInt(s1);//2번째 아규먼트가 없으면 기본값이 10임
		int num2 = Integer.parseInt(s2);*/
		
		System.out.printf("%d\n", num1+8);
		System.out.printf("%d\n", num2+8);
	}
}
