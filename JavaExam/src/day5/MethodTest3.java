package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main()�޼��� ���� ����");
		//int result = addNumber();
		char result = (char)addNumber();
		System.out.println("ȣ�� �����" + result);
		System.out.println("ȣ�� �����" + addNumber());
		System.out.println("main()�޼��� ���� ����");
	}

	public static int addNumber(){
		return 28+20;
	}
}
