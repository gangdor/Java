package day8;
class A{
	A(){
		System.out.println("AŬ���� ��ü ����");
	}
}

class B extends A{
	B(int num){
		System.out.println("BŬ���� ��ü ����");
	}
}

class C extends B{
	C(){
		super(10);
		System.out.println("CŬ���� ��ü ����");
	}
}
public class ABCTest {
	public static void main(String args[]){
		//A a =new A();
		System.out.println();
		//B b =new B();
		System.out.println();
		C c =new C();
	}
}

 