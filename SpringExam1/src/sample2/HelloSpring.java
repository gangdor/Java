package sample2;

//�������踦 ���ϰ� �����ϴ� ���α׷�(���յ��� ����)
public class HelloSpring {
	public static void main(String[] args) {
		//�������� �ڼ��� �����ϴ� ������ ����, �������̽� Ȱ��
		MessageBean bean=new MessageBeanEn();
		bean.sayHello("Spring");
		
		//MessageBean bean=new MessageBeanKr();
		//bean.sayHello("������");
	}
}
