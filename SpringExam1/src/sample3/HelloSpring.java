package sample3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//�������� �̿��ؼ� ����
public class HelloSpring {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory
		         =new ClassPathXmlApplicationContext("bean.xml");
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello("Spring");
		factory.close();
	}
}
