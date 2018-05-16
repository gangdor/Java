package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {
	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("sample5/date.xml");
		//또는   DateVo ob1=(DateVo)factory.getBean("hong");
		//getBean의 리턴값은 object이다. 따라서 무조건 형변환 해줘야 한다.
		//2번쨰 아규먼트로 변환하고자 하는 클래스 객체를 주어도 된다.
		DateVo ob1=factory.getBean("hong", DateVo.class);
		System.out.println(ob1.toString());
		DateVo  ob2=factory.getBean("lee", DateVo.class);
		System.out.println(ob2.toString());
		((ClassPathXmlApplicationContext)factory).close();
	}
}
