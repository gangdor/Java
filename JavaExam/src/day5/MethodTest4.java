package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main()�޼��� ���� ����");
		int result = addNumber(30);
		result = addNumber(100, 200);
		//char result = (char)addNumber();
		System.out.println("ȣ�� �����" + result);
		//System.out.println("ȣ�� �����" + addNumber());
		System.out.println("main()�޼��� ���� ����");
	}
	
	//�޼��� �����ε�
	public static int addNumber(int n1, int n2){
		return n1+n2;
	}
	
	public static int addNumber(int x){
		return x;
	}
}
