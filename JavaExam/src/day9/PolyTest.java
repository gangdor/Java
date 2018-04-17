package day9;

public class PolyTest {

	public static void main(String[] args) {

		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new char[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new day6.Student());
		
	}
	
	//다형성을 의미, java에서 최상위 클래스는 Object이기 떄문에 모든 타입의 객체를 다 수용가능한 Object o!
	//조상클래스 타입의 참조변수로 자손클래스의 객체를 참조할 수 있다.
	public static void printObjectInfo(Object o){
		//System.out.println(o.toString());
		if(o instanceof String) //왼쪽은 참조형 변수, 오른쪽은 클래스타입 : 참이면 true, 거짓이면 false
			System.out.println("문자열객체 : " + o.toString() + "(" + ((String)o).length() +")"); //toString 문자열 가져오는 메서드
		else
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());
		
	}

}
