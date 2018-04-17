package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main()메서드 수행 시작");
		//int result = addNumber();
		char result = (char)addNumber();
		System.out.println("호출 결과값" + result);
		System.out.println("호출 결과값" + addNumber());
		System.out.println("main()메서드 수행 종료");
	}

	public static int addNumber(){
		return 28+20;
	}
}
