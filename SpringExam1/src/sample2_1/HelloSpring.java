package sample2_1;

//�������踦 ���ϰ� �����ϴ� ���α׷�(���յ��� ����)
public class HelloSpring {
	public static void main(String[] args) {
		//�������� �ڼ��� �����ϴ� ������ ����, �������̽� Ȱ��
		MessageBean bean= MessageBeanFactory.getBean();
		bean.sayHello("Spring");
		//MessageBean bean=new MessageBeanKr();
		//bean.sayHello("������");
	}
}
