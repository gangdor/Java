package exam2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class GreetingTest {
	public static void main(String[] args) {
 		ApplicationContext factory = new ClassPathXmlApplicationContext("exam2/bean.xml");
		Greeting greet =null;
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HHmmss");
		int cur_time = Integer.parseInt(time.format(timeFormat));
		//�ð��� �°� ��ü�� ���� �� �Լ� ȣ�� ����
		String str = "";
		if(000000<=cur_time && cur_time<=120000) str="Morning";
		else if(120001<=cur_time && cur_time<=170000) str="Afternoon";
		else if(170001<=cur_time && cur_time<=240000) str="Evening";
		greet = factory.getBean(str,Greeting.class);
		greet.greet();
		((ClassPathXmlApplicationContext)factory).close();
	}
}
