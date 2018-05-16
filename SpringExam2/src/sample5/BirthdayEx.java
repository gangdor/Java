package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {
	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("sample5/date.xml");
		//�Ǵ�   DateVo ob1=(DateVo)factory.getBean("hong");
		//getBean�� ���ϰ��� object�̴�. ���� ������ ����ȯ ����� �Ѵ�.
		//2���� �ƱԸ�Ʈ�� ��ȯ�ϰ��� �ϴ� Ŭ���� ��ü�� �־ �ȴ�.
		DateVo ob1=factory.getBean("hong", DateVo.class);
		System.out.println(ob1.toString());
		DateVo  ob2=factory.getBean("lee", DateVo.class);
		System.out.println(ob2.toString());
		((ClassPathXmlApplicationContext)factory).close();
	}
}
