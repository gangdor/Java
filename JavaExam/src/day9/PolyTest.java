package day9;

public class PolyTest {

	public static void main(String[] args) {

		printObjectInfo(new Object());
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new char[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new day6.Student());
		
	}
	
	//�������� �ǹ�, java���� �ֻ��� Ŭ������ Object�̱� ������ ��� Ÿ���� ��ü�� �� ���밡���� Object o!
	//����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ ��ü�� ������ �� �ִ�.
	public static void printObjectInfo(Object o){
		//System.out.println(o.toString());
		if(o instanceof String) //������ ������ ����, �������� Ŭ����Ÿ�� : ���̸� true, �����̸� false
			System.out.println("���ڿ���ü : " + o.toString() + "(" + ((String)o).length() +")"); //toString ���ڿ� �������� �޼���
		else
			System.out.println("���޵� ��ü�� Ŭ������ : " + o.getClass().getName());
		
	}

}
