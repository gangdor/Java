package sample2;

public class Foo implements InterFoo{
	public Foo() {
		System.out.println("Foo��ü ����");
	}
	public Foo(String str) {
		System.out.println(str);
		System.out.println("-----------------------");
	}
	public Foo(String str, int n) {
		System.out.println(str + "  " + n);
		System.out.println("-----------------------");
	}
	public Foo(String str, int n, boolean b) {
		System.out.println(str + "  " + n + "   " + b);
		System.out.println("-----------------------");
	}
	public Foo(Bar bar) {
		System.out.println("��ü ���� ����");
		System.out.println("----------------------- ");
	}
}








