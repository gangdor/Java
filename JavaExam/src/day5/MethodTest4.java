package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main()메서드 수행 시작");
		int result = addNumber(30);
		result = addNumber(100, 200);
		//char result = (char)addNumber();
		System.out.println("호출 결과값" + result);
		//System.out.println("호출 결과값" + addNumber());
		System.out.println("main()메서드 수행 종료");
	}
	
	//메서드 오버로딩
	public static int addNumber(int n1, int n2){
		return n1+n2;
	}
	
	public static int addNumber(int x){
		return x;
	}
}
