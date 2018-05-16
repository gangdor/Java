package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		//DI를 통해 객체를 생성하는데, 초기화 할때 객체생성을 미리하는구나.
		ApplicationContext factory
		    	= new ClassPathXmlApplicationContext("sample1/beans.xml");
		System.out.println("**** Container 초기화 작업 끝 ****");
		
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.sayHello();                 //주입
		bean.sayHello("banana", 1500);   //대입
		
		//default가 싱글톤이다.
		System.out.println(bean);
		System.out.println(factory.getBean("messageBean"));
		System.out.println(factory.getBean("messageBean"));
		((ClassPathXmlApplicationContext)factory).close();
	}
}





