package anno05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverCar {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("anno05/bean.xml");
		
		Tire tire=factory.getBean("koreaTire", Tire.class);
		System.out.println(tire.getBrand());
		
		Car tire2=factory.getBean("carTire", Car.class);
		tire2.drive();
		
		((ClassPathXmlApplicationContext)factory).close();	
	}
}
/* [���ȭ��]
�ѱ�Ÿ�̾�
�ѱ�Ÿ�̾�� ������� ���� �ڵ���
*/







