package lab;


import java.util.Random;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryExam {

	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("lab/salary.xml");
		//month를 랜덤으로 만든다.
		Random r = factory.getBean("random", Random.class);
		int month = r.nextInt(12)+1;
		//grade를 만든다.
		int grade = r.nextInt(4)+1;
		SalaryExpr sal1 = factory.getBean("sal1", SalaryExpr.class);
		SalaryExpr sal2 = factory.getBean("sal2", SalaryExpr.class);
		// 짝수달은 보너스달임
		if (month % 2 == 0) {
			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal2.getSalary(grade));
		} else {
			System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, sal1.getSalary(grade));
		}
		((ClassPathXmlApplicationContext)factory).close();

	}
}