package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		//DI�� ���� ��ü�� �����ϴµ�, �ʱ�ȭ �Ҷ� ��ü������ �̸��ϴ±���.
		ApplicationContext factory
		    	= new ClassPathXmlApplicationContext("sample1/beans.xml");
		System.out.println("**** Container �ʱ�ȭ �۾� �� ****");
		
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello();                 //����
		bean.sayHello("banana", 1500);   //����
		
		//default�� �̱����̴�.
		System.out.println(bean);
		System.out.println(factory.getBean("messageBean"));
		System.out.println(factory.getBean("messageBean"));
		((ClassPathXmlApplicationContext)factory).close();
	}
}





