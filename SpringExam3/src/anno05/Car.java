package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carTire")   //�⺻�� : car
public class Car {
	@Autowired //koreaTire�� ���Եȴ�. //
	//autowire�� ��������� �̸��� ������ �ִ� ��ü�� ã���ּ���.
	//������ tire Ÿ���� ã���ּ���
	//ã���� setter �޼��带 �˾Ƽ� ���� ��������� �Ҵ����ּ���.
	private Tire tire;
	public Car() {
		//super();
		System.out.println("īŸ�̾� ������ ȣ�� �Ķ�����");
	}
	public Car(Tire tire) {
		//super();
		this.tire = tire;
		System.out.println("īŸ�̾� ������ ȣ�� �Ķ�����");
	}
	
	public void drive(){
		System.out.println(tire.getBrand() + "�� ������� ���� �ڵ���");
	}
}


