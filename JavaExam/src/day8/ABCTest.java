package day8;
class A{
	A(){
		System.out.println("A클라스의 객체 생성");
	}
}

class B extends A{
	B(int num){
		System.out.println("B클라스의 객체 생성");
	}
}

class C extends B{
	C(){
		super(10);
		System.out.println("C클라스의 객체 생성");
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

 