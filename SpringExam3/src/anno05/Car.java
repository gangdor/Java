package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carTire")   //기본값 : car
public class Car {
	@Autowired //koreaTire가 대입된다. //
	//autowire는 멤버변수의 이름을 가지고 있는 객체를 찾아주세요.
	//없으면 tire 타입을 찾아주세요
	//찾으면 setter 메서드를 알아서 만들어서 멤버변수를 할당해주세요.
	private Tire tire;
	public Car() {
		//super();
		System.out.println("카타이어 생성자 호출 파람없음");
	}
	public Car(Tire tire) {
		//super();
		this.tire = tire;
		System.out.println("카타이어 생성자 호출 파람있음");
	}
	
	public void drive(){
		System.out.println(tire.getBrand() + "로 만들어진 국산 자동차");
	}
}


